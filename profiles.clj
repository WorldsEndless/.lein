{:user {:plugins [[lein-localrepo "0.5.4"]
                  [lein-try "0.4.3"]
                  [lein-create-template "0.2.0"]
                  [lein-ancient "0.6.15"]
                  [lein-pprint "1.2.0"]
                  [jonase/eastwood "0.3.5"]
                  ;[cider/cider-nrepl "0.18.0"]
                  [lein-figwheel "0.5.19"]
                  [lein-cloverage "1.1.2"]]
        :dependencies [[figwheel-sidecar "0.5.19"]
                       [cider/piggieback "0.4.2"]
                       [org.clojure/tools.nrepl "0.2.13"]]
        ;; :repl-options {:nrepl-middleware [cider.piggieback/wrap-cljs-repl]}
        }}
