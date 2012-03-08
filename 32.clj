


(println
 (
(fn cpy [l] 
  (if (empty? l)
    l
  (cons (first l) (cons (first l) (cpy (rest l))))
  )
  )  [1 2 3]

)
)