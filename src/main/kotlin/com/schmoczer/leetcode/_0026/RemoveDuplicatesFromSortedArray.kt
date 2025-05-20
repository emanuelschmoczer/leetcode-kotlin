package com.schmoczer.leetcode._0026

class RemoveDuplicatesFromSortedArray {
    // Runtime 1ms Beats 100.00%
    fun removeDuplicates(nums: IntArray): Int {
        val copied = IntArray(nums.size)
        System.arraycopy(nums, 0, copied, 0, nums.size)
        var previousNumber: Int = -101
        var result = 0
        for (currentNumber in copied) {
            if (currentNumber != previousNumber) {
                nums[result] = currentNumber
                result++
                previousNumber = currentNumber
            }
        }
        return result
    }
}
