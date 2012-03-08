






(println


 
 (

  (fn zm   [a b]

    (if (or (empty? a) (empty? b))
      '{}

      (conj {(first a) (first b)} (zm (rest a) (rest b)))

)

    )  [:a :b :c] [1 2 3]

)



)