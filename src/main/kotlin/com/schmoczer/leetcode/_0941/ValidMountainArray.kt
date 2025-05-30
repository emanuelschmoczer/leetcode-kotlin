package com.schmoczer.leetcode._0941

class ValidMountainArray {
    // Runtime 184ms Beats 89.11%
    fun validMountainArray(arr: IntArray): Boolean {
        if (arr.size < 3) {
            return false
        }

        var max = -1
        var maxInd = 0
        // find first local max
        for (index in 0 until arr.size) {
            val num = arr[index]
            if (num > max) {
                max = num
                maxInd = index
            } else {
                break
            }
        }

        if (arr[0] == max || arr.last() == max) {
            return false
        }

        // check if all elements after our first max are really descending
        for (i in maxInd until arr.lastIndex) {
            if (arr[i] <= arr[i + 1]) {
                return false
            }
        }

        return true
    }
}
