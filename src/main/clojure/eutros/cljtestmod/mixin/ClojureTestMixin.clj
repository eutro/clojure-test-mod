;; FIXME all the generated classes end up in the same package, which Mixin doesn't like.

(ns eutros.cljtestmod.mixin.ClojureTestMixin
  (:import net.minecraft.client.gui.screen.TitleScreen
           org.spongepowered.asm.mixin.Mixin
           org.spongepowered.asm.mixin.injection.At
           org.spongepowered.asm.mixin.injection.Inject
           org.spongepowered.asm.mixin.injection.callback.CallbackInfo))

(gen-class
 :name ^{Mixin [TitleScreen]}
       eutros.cljtestmod.mixin.ClojureTestMixin
 :main false
 :methods
       [[^{Inject   {:at     (At "HEAD")
                     :method "init()V"}
           :private true}
         init
         [org.spongepowered.asm.mixin.injection.callback.CallbackInfo]
         void]])

(defn init [^CallbackInfo callbackInfo]
  (println "This line is printed by a clojure test mod mixin!"))
