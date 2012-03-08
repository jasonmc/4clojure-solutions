



(println

 (

(fn fdistinct [l]

  (if (empty? l)
    l
  
  (cons (first l) (fdistinct (filter #(not= % (first l) ) (rest l) )))

)
  )

[1 2 1 3 1 2 4]



)

)

