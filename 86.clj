





(println


 (
  (fn [num]
    ((complement not-any?) #{1}
     
     (
      (fn happy [n]
        (let [digits  (map #(Integer/parseInt (str %1)) (str n))
              alg (reduce + (map #(* % %) digits)) ]
          (take-while #(not= % n) (cons alg (lazy-seq (happy  alg ) )) )
          ))
    
      num ) )


    )
    

  7
;;986543210




 )

)

