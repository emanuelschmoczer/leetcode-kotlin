package com.schmoczer.leetcode._3254

class FindThePowerOfKSizeSubarrays {
    // Approach 1: Runtime 1ms Beats 100.00%
    fun resultsArray(nums: IntArray, k: Int): IntArray {
        if (k == 1) {
            return nums
        }

        val powers = IntArray(nums.size - k + 1) { -1 }
        var begin = 0
        var previousValue = nums[0]
        for (i in 1 until nums.size) {
            val currentValue = nums[i]
            if (currentValue == previousValue + 1) {
                if (i - k + 1 == begin) {
                    powers[i - k + 1] = currentValue
                    begin++
                }
            } else {
                begin = i
            }
            previousValue = currentValue
        }
        return powers
    }

    // Approach 2: using a ArrayDeque
    fun resultsArray2(nums: IntArray, k: Int): IntArray {
        if (k == 1) {
            return nums
        }

        val powers = IntArray(nums.size - k + 1) { -1 }
        val queue = ArrayDeque<Int>()
        for (i in 0 until nums.size) {
            val current = nums[i]
            if (queue.isEmpty()) {
                queue.add(current)
            } else {
                val previous = queue.last()
                if (current != previous + 1) {
                    queue.clear()
                }
                queue.add(current)
                if (queue.size == k) {
                    powers[i - k + 1] = current
                    queue.removeFirst()
                }
            }
        }

        return powers
    }
}
