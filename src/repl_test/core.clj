(ns repl-test.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println (str "a" (/ x 2)))
  (println x "Hello, World!"))
  
(defn bar
 "Test for nREPL middleware"  
 [x]
 (* x x))