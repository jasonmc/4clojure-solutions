

(println
 (
  (fn  [& l] 
    
    (reduce #(if (> %1 %2)
               %1
               %2)
             (first l) (rest l))
              
              ) 1 9 3 )
 )


;; (println
 
;; (reduce #( if (< %1 %2) %2  %1) 1 (5 9 7)  )

;; )

;; (println

;;  (reduce #(if (< %1 %2) %2 %1) 1 (5 9 7))

;;  )


;; (println

;;  (
;; (fn [& l]
;;   (reduce #(if (< %1 %2) %2 %1) (first l) (rest l))) 1 9 3
;; )
;; )