package com.schmoczer.leetcode._1574

class ShortestSubarray {
    // Runtime 2ms Beats 96.00%
    fun findLengthOfShortestSubarray(arr: IntArray): Int {
        var left = 0
        var right = arr.size - 1
        while (right > 0 && arr[right] >= arr[right - 1]) {
            right--
        }
        while (left < right && (left == 0 || arr[left] >= arr[left - 1])) {
            if (right < arr.size && arr[left] > arr[right]) {
                right++
            }
            left++
        }
        return right - left
    }
}
