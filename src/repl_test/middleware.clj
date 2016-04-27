(ns repl-test.middleware)

(defn middleware
 "Lein middleware to handle debug requests." 
 [handler]
 (fn [msg] 
  (str "Ahoy! " (handler msg))))