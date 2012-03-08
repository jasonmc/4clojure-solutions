


(println
(
(fn splittype [l]


  (map (fn [x] (filter #(= (type %)  x  ) l) ) (set (map type l)))





         ) [1 :a 2 :b 3 :c]

)

)