
(println
(
(fn dropnth [l n]

  (if (empty? l)
    l
  
  (concat
   (take (- n 1) l)

   (dropnth (drop n l) n)
   )

  )

  ) [1 2 3 4 5 6 7 8] 3)

)