object Cocktail_sort {
    def cocktail_sort(arr: Array[Int]): Array[Int] = {
        var swapped = true
        var start = 0
        var end = arr.length - 1
    
        while (swapped) {
            swapped = false
      
            for (i <- start until end) {
                if (arr(i) > arr(i + 1)) {
                    val temp = arr(i)
                    arr(i) = arr(i + 1)
                    arr(i + 1) = temp
                    swapped = true
                }
            }
      
            if (!swapped) {
                return arr
            }
      
            swapped = false
            end -= 1
      
            for (i <- end - 1 to start by -1) {
                if (arr(i) > arr(i + 1)) {
                    val temp = arr(i)
                    arr(i) = arr(i + 1)
                    arr(i + 1) = temp
                    swapped = true
                }
            }
      
            start += 1
        }
    
        arr
    }
}
