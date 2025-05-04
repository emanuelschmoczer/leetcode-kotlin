package com.schmoczer.leetcode._0485

import kotlin.math.max

class MaxConsecutiveOnes {
    // Approach 1: intuitive one pass solution with sliding with
    // Runtime 2ms Beats 100.00%
    fun findMaxConsecutiveOnes1(nums: IntArray): Int {
        var result = 0
        var current = 0
        for (number in nums) {
            if (number == 1) {
                current++
            } else {
                if (current > result) {
                    result = current
                }
                current = 0
            }
        }
        return max(result, current)
    }

    // Approach 2: Two pointers
    // Runtime 2ms Beats 100.00%
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var result = 0
        var left = 0

        while (left < nums.size) {
            while (left < nums.size && nums[left] == 0) {
                left++
            }

            var right = left
            while (right < nums.size && nums[right] == 1) {
                right++
            }

            val current = right - left
            if (current > result) {
                result = current
            }
            left = right + 1
        }

        return result
    }
}
