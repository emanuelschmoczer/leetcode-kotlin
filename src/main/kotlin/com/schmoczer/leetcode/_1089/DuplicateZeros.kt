package com.schmoczer.leetcode._1089

class DuplicateZeros {
    // Runtime 0ms Beats 100.00%
    fun duplicateZeros(arr: IntArray) {
        val size = arr.size
        val duplicate = IntArray(size)
        System.arraycopy(arr, 0, duplicate, 0, size)
        var index = 0
        for (number in duplicate) {
            if (index >= size) {
                break
            }
            arr[index] = number
            index++
            if (number == 0 && index < size) {
                arr[index] = number
                index++
            }
        }
    }
}
