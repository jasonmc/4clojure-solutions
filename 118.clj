




(println

 (

  (fn mymap  [func coll]

    (if (empty? coll)
      coll

      (lazy-seq (cons (func (first coll)) (mymap func (rest coll))))
      

      )


    )

inc [2 3 4 5 6]



)

)

