




(println

 (

  (fn [a b]

    (apply min (filter  (set (map #(* b %) (range 1 (inc a)))   )      (map #(* a %)  (range 1 (inc b)))))


    )

4 6



)



 

)

