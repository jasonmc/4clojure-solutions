




(println

 (

  (fn [l]

    (clojure.string/join "," (map str (filter #(= (*(Math/sqrt %) (Math/sqrt %)) %) (map #(Integer/parseInt %) (re-seq #"\d+" l))   )))
    
    )

"4,5,6,7,8,9"



)

)

