




(println

 (

  (fn [f s]


   (zipmap  (distinct (map f s))   (map  #(vec (filter (fn [i] (= (f i) %))  s))     (distinct (map f s))  ))

    )
  
#(> % 5) #{1 3 6 8}




)

)
