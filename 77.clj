




(println

 (


  (fn [coll]
    (set (filter #(> (count %) 1)   (map set (vals (group-by sort coll)))))
    )

  ["meat" "mat" "team" "mate" "eat"]


  )


 )