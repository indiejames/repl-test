(ns repl-test.core
 "Test namespace")
(def abc {:a "A" :b "B" :c {:d "D"}})
(defn foo
  "I don't do a whole lot."
  [x yy]
  (println (str "a" (/ x 2)))
  (println x "Hello, World!")
  "Done")

(defn bar
 "Test for nREPL middleware"
 [x]
 (foo 1 x)
 (* x x))
(+ 1 4)
(foo 1 4)