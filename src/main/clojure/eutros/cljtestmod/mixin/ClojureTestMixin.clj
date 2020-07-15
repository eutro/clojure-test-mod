;; FIXME generates public static main([Ljava/lang/String;)I
;; FIXME missing annotation when compiled

(ns eutros.cljtestmod.mixin.ClojureTestMixin
  (:import net.minecraft.client.gui.screen.TitleScreen
           org.spongepowered.asm.mixin.Mixin
           org.spongepowered.asm.mixin.injection.At
           org.spongepowered.asm.mixin.injection.Inject
           org.spongepowered.asm.mixin.injection.callback.CallbackInfo)
  (:gen-class
    :name ^{Mixin [TitleScreen]}
          eutros.cljtestmod.mixin.ClojureTestMixin))

