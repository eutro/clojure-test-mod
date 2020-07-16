(ns eutros.cljtestmod.CljTestMod
  (:gen-class
    :main false
    :implements [net.fabricmc.api.ModInitializer]))

(defn -onInitialize
  [this]
  (println "Hello Clojure Fabric World!"))

