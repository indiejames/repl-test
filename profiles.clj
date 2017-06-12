{:debug-repl {:resource-paths [#=(eval (System/getenv "PATH_TO_TOOLS_JAR"))]
              :repl-options {:nrepl-middleware [debug-middleware.core/debug-middleware]}
              :dependencies [[org.clojure/clojure "1.8.0"]
                             [debug-middleware #=(eval (System/getenv "DEBUG_MIDDLEWARE_VERSION"))]]}}

