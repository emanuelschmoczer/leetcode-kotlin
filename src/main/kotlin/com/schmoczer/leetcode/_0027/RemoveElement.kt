package com.schmoczer.leetcode._0027

class RemoveElement {
    // Runtime 0ms Beats 100.00%
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val copied = IntArray(nums.size)
        System.arraycopy(nums, 0, copied, 0, nums.size)
        var result = 0
        var index = 0
        for (number in copied) {
            if (number == `val`) {
                result++
            } else {
                nums[index] = number
                index++
            }
        }
        return index
    }
}
