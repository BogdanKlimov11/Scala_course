object Bubble_sort {
    def bubble_sort(arr: Array[Int]): Array[Int] = {
        val n = arr.length
        var swapped = false
        do {
            swapped = false
            for (i <- 0 until n - 1) {
                if (arr(i) > arr(i + 1)) {
                    val temp = arr(i)
                    arr(i) = arr(i + 1)
                    arr(i + 1) = temp
                    swapped = true
                }
            }
        } while (swapped)
        arr
    }
}
