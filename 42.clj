

(println
 (
(fn fac  [x] 
    (if (> x 1)
      (* x (fac (- x 1)))
      1
)
    ) 5
)
)