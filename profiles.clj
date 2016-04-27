{:debug-repl {:resource-paths ["/Library/Java/JavaVirtualMachines/jdk1.8.0_74.jdk/Contents/Home/lib/tools.jar"]
              :repl-options {:nrepl-middleware [debug-middleware.core/debug-middleware]}
              :dependencies [[org.clojure/clojure "1.5.1"]
                             [debug-middleware "0.1.1-SNAPSHOT"]
                             [compliment "0.2.7"]]}}                        
              