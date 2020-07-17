(ns eutros.cljtestmod.mixin.ClojureTestMixin
  (:import net.minecraft.client.gui.screen.TitleScreen
           org.spongepowered.asm.mixin.Mixin
           org.spongepowered.asm.mixin.injection.At
           org.spongepowered.asm.mixin.injection.Inject))

(gen-class
 :name         ^{Mixin [TitleScreen]}
               eutros.cljtestmod.mixin.ClojureTestMixin
 :main         false
 :impl-ns      eutros.cljtestmod.internal.ClojureTestMixin
 :load-impl-ns false
 :methods
               [[^{Inject {:at     (At "HEAD")
                           :method "init()V"}}
                 ;; FIXME this should generate private and/or static methods
                 init
                 [org.spongepowered.asm.mixin.injection.callback.CallbackInfo]
                 void]])
