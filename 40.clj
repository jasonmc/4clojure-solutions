

(println

       (       

(fn intp


   [n,l]
      (if (empty? (rest l))
        l
        (cons (first l) (cons n (intp n (rest l))))
        )
      ) 0 [1 2 3]
)
)