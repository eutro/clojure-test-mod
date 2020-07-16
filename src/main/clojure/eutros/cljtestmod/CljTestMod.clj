(ns eutros.cljtestmod.CljTestMod)

(gen-class
 :name       eutros.cljtestmod.CljTestMod
 :main       false
 :implements [net.fabricmc.api.ModInitializer])

(load "internal/ClojureTestMixin")

(defn -onInitialize
  [this]
  (println "Hello Clojure Fabric World!"))

