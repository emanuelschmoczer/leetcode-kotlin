package com.schmoczer.leetcode._1299

class ReplaceElementsWithGreatestElementOnRightSide {
    // Runtime 2ms Beats 100.00%
    fun replaceElements(arr: IntArray): IntArray {
        var greatest = -1
        for (index in arr.size - 1 downTo 0) {
            val current = arr[index]
            arr[index] = greatest
            if (current > greatest) {
                greatest = current
            }
        }
        return arr
    }
}
