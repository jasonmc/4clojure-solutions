



(println


 
(

 (fn rep   [l n]

   (mapcat  #(take n (repeat %)) l)



) [1 2 3] 2

    )



)