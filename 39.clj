


(println


 
 (

  (fn rep   [a b]

    (if (or (empty? a) (empty? b))
      '()

      (cons (first a) (cons (first b) (rep (rest a) (rest b))))

)

    ) [1 2 3] [:a :b :c]

)



)