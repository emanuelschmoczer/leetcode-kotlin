package com.schmoczer.leetcode._1480

class RunningSumOf1dArray {
    // Runtime 0ms Beats 100.00%
    fun runningSum(nums: IntArray): IntArray {
        val sums = IntArray(nums.size)
        var currentSum = 0
        for (index in 0..<nums.size) {
            currentSum += nums[index]
            sums[index] = currentSum
        }
        return sums
    }
}
