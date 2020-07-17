(ns eutros.cljtestmod.internal.ClojureTestMixin
  (:import org.spongepowered.asm.mixin.injection.callback.CallbackInfo))

(defn -init [_ ^CallbackInfo callbackInfo]
  (println "This line is printed by the Clojure Test Mod mixin!"))
