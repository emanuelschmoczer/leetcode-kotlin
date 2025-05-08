package com.schmoczer.leetcode._0977

import kotlin.math.abs

class SquaresOfASortedArray {
    // Approach 1: two passes, first add all squares, then sort
    fun sortedSquares1(nums: IntArray): IntArray {
        val result = mutableListOf<Int>()
        for (number in nums) {
            result.add(number * number)
        }
        return result.sorted().toIntArray()
    }

    // Approach 2: one pass with two pointers
    // Runtime 1ms Beats 100.00%
    fun sortedSquares(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var left = 0
        var right = nums.size - 1
        var index = right
        while (left <= right) {
            val leftNumber = abs(nums[left])
            val rightNumber = nums[right]
            if (leftNumber > rightNumber) {
                result[index] = leftNumber * leftNumber
                left++
            } else {
                result[index] = rightNumber * rightNumber
                right--
            }
            index--
        }
        return result
    }
}
