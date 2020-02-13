(ns emperor-chess.prod
  (:require [emperor-chess.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
