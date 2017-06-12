(ns repl-test.sequential-tests
  (:require [clojure.test :refer :all]
            [repl-test.core :refer [foo]]))            
(deftest a-test-seq
 (testing "FIXME, I fail seq."
   (Thread/sleep 2000)
   (is (= 0 (foo 1 2)))))

(deftest another-test-seq
 (testing "I pass seq."
   (Thread/sleep 5000)
   (is (= 3 (+ 2 1)))))

(deftest another-failure-seq
  (testing "Map mismatch seq"
    (Thread/sleep 1000)
    (is (= {:a "A" :b "B" :c [1 2 3]}
           {:a "A" :b "b" :c [0 2 3]}))))
