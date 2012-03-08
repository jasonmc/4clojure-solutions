



(println

     



(= (take 5 (        
(fn iter [f n]


  (cons n (lazy-seq (iter f (f n))))

  )

#(* 2 %) 1)) [1 2 4 8 16])






)

