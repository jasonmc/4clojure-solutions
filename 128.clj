



(println

 (

(fn [code]

  (let [a (first code) b (second code)]

    (hash-map '(
    
    (if (= a \C)
      :club
      (if (= a \H)
        :heart

        (if (= a \D)
          :diamond

          (if (= a \S)
            :space
            )
          )
        )
      )

    (if (= b \A)
      :ace
      )

    )

)

    
    )
  )

"SA"

)

)