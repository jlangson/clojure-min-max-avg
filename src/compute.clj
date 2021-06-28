(ns compute)

(defn avg [ints]
  (/ (reduce + 0 ints) (count ints)))

(defn compute [ints]
  (if
    (= (count ints) 0)
    (do "cannot compute values of empty array")
    (let [minimum (apply min ints)
          maximum (apply max ints)
          average (avg ints)]
      ["min=" minimum, "max=" maximum, "average=" average])))

(def inputs
  [[1 2 3 4 5]
  [-5 0 3 8]
  [Integer/MAX_VALUE -8 0 33]
  [Integer/MIN_VALUE -8 0 33]
  []])

(defn -main [& args]
  (doseq [input inputs]
    (println (compute input))))