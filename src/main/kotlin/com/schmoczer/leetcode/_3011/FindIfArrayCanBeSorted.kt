package com.schmoczer.leetcode._3011

class FindIfArrayCanBeSorted {
    fun canSortArray(nums: IntArray): Boolean {
        var counter = 0
        while (nums.isSorted().not() && counter < nums.size) {
            for (i in 0 until nums.size - 1) {
                val current = nums[i]
                val next = nums[i + 1]
                if (next < current && next.countOneBits() == current.countOneBits()) {
                    nums[i] = next
                    nums[i + 1] = current
                }
            }
            counter++
        }

        return nums.isSorted()
    }
}

private fun IntArray.isSorted(): Boolean {
    var previous = Int.MIN_VALUE
    for (number in this) {
        if (number < previous) {
            return false
        }
        previous = number
    }
    return true
}
