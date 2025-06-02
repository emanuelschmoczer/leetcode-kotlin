package com.schmoczer.leetcode._0905

class SortArrayByParity {
    // Runtime 1ms Beats 96.34%
    fun sortArrayByParity(nums: IntArray): IntArray {
        var slow = 0
        for (fast in 0 until nums.size) {
            if (nums[fast] and 1 == 0) {
                val number = nums[slow]
                nums[slow] = nums[fast]
                nums[fast] = number
                slow++
            }
        }
        return nums
    }
}
