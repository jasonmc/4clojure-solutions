




(println

 (

  (fn [l]

    (zipmap (distinct l)  (map  #( count (filter (fn [x] (= x %) ) l)  ) (distinct l)))



    )



  [1 1 2 3 2 1 1]

  )

    
    )

