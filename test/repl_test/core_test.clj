(ns repl-test.core-test
  (:require [clojure.test :refer :all]
            [repl-test.core :refer [foo]]))            
(deftest a-test
 (testing "FIXME, I fail."
   (is (= 0 (repl-test.core/foo 1 2)))))


(deftest another-test
 (testing "I pass."
   (is (= 2 (+ 1 1)))))