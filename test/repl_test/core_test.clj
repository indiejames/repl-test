(ns repl-test.core-test
  (:require [clojure.test :refer :all]
            [repl-test.core :refer [foo]]))            
(deftest a-test
 (testing "FIXME, I fail."
  ;  (Thread/sleep 2000)
   (is (= 0 (foo 1 2)))))

(deftest another-test
 (testing "I pass."
  ;  (Thread/sleep 5000)
   (is (= 3 (+ 1 1)))))

(deftest another-failure
  (testing "Map mismatch"
    ; (Thread/sleep 1000)
    (is (= {:a "A" :b "B" :c [1 2 3]}
           {:a "A" :b "b" :c [0 2 3]}))))

(deftest exception-test
  (testing "Exceptions"
    ; (Thread/sleep 6000)
    (is (= true (throw (Exception. "An exception"))))))
