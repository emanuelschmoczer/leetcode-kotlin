package com.schmoczer.leetcode._0001

class TwoSum {
    // Attempt 1
    fun twoSum1(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }

    // Attempt 2 using a Map: Runtime 2ms Beats 100.00%
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val complements = mutableMapOf<Int, Int>()
        for (i in 0 until nums.size) {
            val currentValue = nums[i]
            val complement = complements[target - currentValue]
            if (complement != null) {
                return intArrayOf(complement, i)
            }
            complements[currentValue] = i
        }
        return intArrayOf()
    }
}
