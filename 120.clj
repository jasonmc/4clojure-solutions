


(println

 (

  (fn ssds [coll]
    

    (letfn  [(digits [i]  (map #(Integer/parseInt (str %1)) (str i))
               )
             (alg [i] (reduce + (map #(* % %) (digits i)  ))) ]

      
      (count   (filter #(< % (alg %) )   coll)  )
      
      )

    )

  (range 10)

  )

 )
