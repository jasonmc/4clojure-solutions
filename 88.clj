



(println

 (

(fn  [a b]  (clojure.set/union (apply disj a b)  (apply disj b a))  )


#{1 2 3 4 5 6} #{1 3 5 7}



)

)

