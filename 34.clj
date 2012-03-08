
(print
       (
        (fn rng [a b] 

          (take (- b a) (iterate inc a))

          ) -2 2
            )
       )