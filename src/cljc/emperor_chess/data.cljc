(ns emperor-chess.data
  (:require [reagent.core :as r]
            [clojure.spec.alpha :as s]))

;; Represent the stats of each piece.
(defonce piece-stats
         {:pawn   {:food 1 :ap 1 :ip 1}
          :rook   {:food 2 :ap 3 :ip 1}
          :knight {:food 3 :ap 2 :ip 1}
          :bishop {:food 2 :ap 2 :ip 3}
          :queen  {:food 1 :ap 3 :ip 3}
          :king   {:food 1 :ap 1 :ip 4}})

;; Represent the location of each piece at the beginning of the game.
(defonce piece-locations
         {:pawn   (vec (apply concat (for [y (range 8)] [[1 y] [6 y]])))
          :rook   [[0 0] [0 7] [7 0] [7 7]]
          :knight [[0 1] [0 6] [7 1] [7 6]]
          :bishop [[0 2] [0 5] [7 2] [7 5]]
          :queen  [[0 3] [7 3]]
          :king   [[0 4] [7 4]]})

(s/def ::food pos-int?)
(s/def ::ap pos-int?)
(s/def ::ip pos-int?)
(s/def ::stats (s/keys :req-un [::food ::ap ::ip]))
(s/def ::type #{:pawn :rook :knight :bishop :queen :king})
(s/def ::cell (s/keys :req-un [::type ::stats]))
(s/def ::cols (s/map-of int? ::cell))
(s/def ::rows (s/map-of int? ::cols))

(s/fdef new-board :ret ::rows)

;; Represent an new board at the beginning of the game. Convert the entire
;; thing into a 2d map (map of maps) for easy query.
(defn new-board
  "Create a new board for the game."
  []
  ; This build the entire board with both occupied and empty cells.
  (reduce
    (fn [acc loc]
      (if-not (get-in acc loc)
        (assoc-in acc loc nil)
        acc))

    ; This build the occupied cells so we can populate the empty ones
    (reduce-kv
      (fn [m k v]
        (reduce
          (fn [acc loc]
            (assoc-in acc loc {:type k :stats (get piece-stats k)}))
          m
          v))
      {}
      piece-locations)

    ; All the cells within the board
    (for [row (range 8) col (range 8)] [row col])))
