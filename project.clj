(defproject repl_test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  ;; :plugins [[continuum-test "0.1.0-SNAPSHOT"]
  ;;           [lein-cljfmt "0.5.6"]]
  ;; :hooks [leiningen.continuum-test]
  :source-paths ["src" "test" "int_test" "dev"]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.3.442"]
                 [cheshire "5.7.1"]
                 [org.clojure/tools.trace "0.7.9"]
                 [org.clojure/tools.namespace "0.2.11"]])

