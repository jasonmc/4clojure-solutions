



(println

 (


    (fn is-sym?

    ([t]
       (is-sym? (second t) (last t))
       )

    ([l r]

       (and
        (= (first l) (first r))
        (or
         (and (nil? (second l)) (nil? (second r)))
          (is-sym? (second l) (last r)))
        (or
         (and (nil? (last l)) (nil? (last r)))
          (is-sym? (last l) (second r))))
       
       )

)

;;  '(:a (:b nil nil) (:b nil nil))

;;  '(:a (:b nil nil) nil)

  ;; [1
  ;;  [2 nil
  ;;   [3
  ;;    [4
  ;;     [5 nil nil]
  ;;     [6 nil nil]]
  ;;    nil]]
  ;;  [2
  ;;   [3 nil
  ;;    [4
  ;;     [6 nil nil]
  ;;     [5 nil nil]]]
  ;;   nil]]



  [1
   [2 nil
    [3
     [4
      [5 nil nil]
      [6 nil nil]] nil]]
   [2
    [3 nil
     [4
      [5 nil nil]
      [6 nil nil]]] nil]]
    
  

)

)

  ;; (fn is-sym?

  ;;   ([t]
  ;;      (is-sym? (second t) (last t))
  ;;      )

  ;;   ([l r]

  ;;      (and
  ;;       (= (first l) (first r))
  ;;       (or
  ;;        (and (nil? (second l)) (nil? (second r)))
  ;;        (or
  ;;         (is-sym? (second l) (second r))
  ;;         (is-sym? (second l) (last r))))
  ;;       (or
  ;;        (and (nil? (last l)) (nil? (last r)))
  ;;        (or
  ;;         (is-sym? (last l) (last r))
  ;;         (is-sym? (last l) (second r)))))
       
  ;;      )

;; )



  ;; (fn is-sym?

  ;;   ([t]
  ;;      (is-sym? (second t) (last t))
  ;;      )

  ;;   ([l r]

  ;;      (and
  ;;       (= (first l) (first r))
  ;;       (or
  ;;        (and (nil? (second l)) (nil? (second r)))
  ;;        (or
  ;;         (and (is-sym? (second l) (second r))
  ;;              (or
  ;;               (and (nil? (last l)) (nil? (last r)))
  ;;               (is-sym? (last l) (last r))))
          
  ;;         (and (is-sym? (second l) (last r))
  ;;              (or
  ;;               (and (nil? (last l)) (nil? (last r)))
  ;;                (is-sym? (last l) (second r))))

  ;;         )))
       
  ;;      )

  ;; )