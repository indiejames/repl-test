(defproject repl_test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:dev {:dependencies [[jonase/eastwood "0.2.3" :exclusions [org.clojure/clojure]]]}}
  ; :plugins [[refactor-nrepl "2.2.0"]
  ;           [cider/cider-nrepl "0.11.0"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compliment "0.2.7"]])
