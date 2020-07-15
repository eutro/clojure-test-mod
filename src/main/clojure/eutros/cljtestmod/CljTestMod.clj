(ns eutros.cljtestmod.CljTestMod
  (:gen-class
    :name eutros.cljtestmod.CljTestMod
    :implements [net.fabricmc.api.ModInitializer]))

(defn -onInitialize
  [this]
  (println "Hello Clojure Fabric World!"))

