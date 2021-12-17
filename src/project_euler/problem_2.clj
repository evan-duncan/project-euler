(ns project-euler.problem-2)

(defn fib [to]
  (loop [s '[]
        a 0
        b 1]
  (if (> a to)
    s
    (recur (conj s a) b (+ a b)))))

(defn even-fib-to [n]
  (let [v (fib n)]
    (apply + (filter even? v))))
