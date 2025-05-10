package com.schmoczer.leetcode._0088

class MergeSortedArray {
    // Runtime 0ms Beats 100.00%
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        val copied = IntArray(m)
        System.arraycopy(nums1, 0, copied, 0, m)
        var i = 0
        var j = 0
        while (i < m || j < n) {
            if (i == m) {
                nums1[i + j] = nums2[j]
                j++
                continue
            }
            if (j == n) {
                nums1[i + j] = copied[i]
                i++
                continue
            }

            val number1 = copied[i]
            val number2 = nums2[j]
            if (number1 < number2) {
                nums1[i + j] = number1
                i++
            } else {
                nums1[i + j] = number2
                j++
            }
        }
    }
}
