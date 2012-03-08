





(println


 (

  
  (fn [r]

    (cons 1
    (take (dec r)
    (

    (fn v [i r c]

      (cons (* i (/ (- r c) c) ) (lazy-seq (v (* i (/ (- r c) c) ) r (inc c))))

      )

    1 r 1))
    
)
    )
    

  4





 )

)

