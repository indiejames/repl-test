(ns repl-test.core
  "Test namespace"
  (:require [clojure.core.async :as async] 
            [clojure.edn :as edn]
            [clojure.string :as string]
            [clojure.test :as t :refer [report]]
            [eftest.runner :refer [find-tests run-tests]]
            [repl-test.test])
  (:import [clojure.lang.Numbers]))

(defn foo
  "I don't do a whole lot (yet)."
  [x yy]
  (let [z (* x x)]
    (println (str "a" (/ 2 x)))
    (println x "Hello, World!")
    z))


(defn bar
  "Do something"
  [x]
  (let [y (foo 4 x)]
    (foo 4 7) 
    (* y x)))

(def counter (atom 0))

(defn create-thread
  "Create a thread for testing output handling"
  []
  (let [ch (async/chan 10)]
    (async/thread 
      (loop []
        (let [val (async/<!! ch)]
          (swap! counter inc)
          (println val)
          (recur))))
    ch))

(defn hello
  "Hello"
  [name & more]
  (println "Hello, " name " " more))
    
(defn greet
  "Test of sigs"
  ([] (greet "you"))
  ([name] (greet name "coolguy"))
  ([name desc] (println "Hello " name " " desc)))

(defn test-test3
  [_]
  (with-redefs-fn {#'hello (fn [name] (println "Goodbye, " name))}
                  #(hello "James")))

(defn test-test
  "Test rebinding teset namespace function"
  [dir]
  (run-tests (find-tests dir)))

(defn test-test2
  "Test rebinding teset namespace function"
  [dir]
  (with-redefs-fn 
    {#'clojure.test/stacktrace-file-and-line (fn [stacktrace] {:file "foo.clj" :line 1})}
    #(clojure.test/run-tests 'repl-test.core-test)))

(defn test4
 "Simply calls test"
 []
 (clojure.test/run-tests 'repl-test.core-test))

(comment
  (map #(println (.getPath %)) (walk "." #".*\.clj"))
  (test4)
  (test-test "test")
  (run-tests ['repl-test.core-test])
  (greet "James" "Hello")
  (foo 4 10)
  (foo 123 455)
  (foo 1 2)
  (foo 233 343)
  (foo 4 2)
  (foo 1 2)
  (foo 4 2)
  (bar 4)
  (def ch (create-thread))
  (async/>!! ch "Hello")
  @counter)
  
;; A test for exception catching
(defn exception-test
  "Test for catching exceptions"
  [x]
  (let [y (* x x)]
    (* 1 {1 2})
    (println "X = " x " Y = " y)))

(defn print-person
  [person]
  (let [{:keys [fname lname]} person]
    (println fname " " lname)))

(defrecord Person [fname lname])

(comment
  (foo 2 (Person. "James" "Norton")))

; FAIL in (a-test) (core_test.clj:6)

; :diffs ([Done (0 Done)]), :expected 0, :actual (Done)

; {:file core_test.clj, :line 6, :type :fail, :diffs ([Done (0 Done)]), :expected 0, :actual (Done), :message nil}