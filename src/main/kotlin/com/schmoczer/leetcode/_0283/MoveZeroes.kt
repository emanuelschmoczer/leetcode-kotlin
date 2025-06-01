package com.schmoczer.leetcode._0283

class MoveZeroes {
    // Runtime 1ms Beats 100.00%
    fun moveZeroes(nums: IntArray) {
        var slowPointer = 0
        for (fastPointer in 0 until nums.size) {
            if (nums[fastPointer] != 0) {
                nums[slowPointer] = nums[fastPointer]
                slowPointer++
            }
        }
        for (index in slowPointer until nums.size) {
            nums[index] = 0
        }
    }
}
