{:user {:plugins [[lein-localrepo "0.5.4"]
                  [lein-try "0.4.3"]
                  [lein-create-template "0.2.0"]
                  [lein-ancient "0.6.15"]
                  [lein-pprint "1.2.0"]
                  ;[cider/cider-nrepl "0.18.0"]
                  [lein-figwheel "0.5.17"]
                  [lein-cloverage "1.0.13"]]
        :dependencies [[figwheel-sidecar "0.5.17"]
                       [cider/piggieback "0.3.10"]
                       [org.clojure/tools.nrepl "0.2.13"]]
        ;; :repl-options {:nrepl-middleware [cider.piggieback/wrap-cljs-repl]}
        }
 :dev {:dependencies [[cider/piggieback "0.3.10"]
                      [org.clojure/tools.nrepl "0.2.13"]]}}
