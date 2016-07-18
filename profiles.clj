{:debug-repl {:resource-paths ["/Library/Java/JavaVirtualMachines/jdk1.8.0_74.jdk/Contents/Home/lib/tools.jar"]
              :repl-options {:nrepl-middleware [debug-middleware.core/debug-middleware]}
              :plugins [[venantius/ultra "0.4.1"]]
              :dependencies [[org.clojure/clojure "1.8.0"]
                             [debug-middleware "0.1.1-SNAPSHOT"]
                             [compliment "0.2.7"]]}
 :dev {:dependencies [[jonase/eastwood "0.2.3" :exclusions [org.clojure/clojure]]]}
 :user {:plugins [[venantius/ultra "0.4.1"]]}}
