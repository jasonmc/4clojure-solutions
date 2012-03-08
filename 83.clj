







(println
(
 ;; (fn halftruth [& args]
 ;;   (and (not (reduce #(and % %2) args)) (reduce #(or % %2) args))
 ;;   )

#(true? (and (some false? %&) (some true? %&))) false false

)

)





