



(println

 (

(fn carp [a b]

  (set (mapcat #(map (fn [i] [% i] )  b) a))

  )


#{1 2 3} #{4 5}



)

)

