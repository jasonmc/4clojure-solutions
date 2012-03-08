


(println
(
(fn flattens [l]

  (if (seq? l)


    (cons (flattens (first l)) (map flattens (rest l)))


    l

    )
  


  ) ["a" ["b"] "c"]


)

)