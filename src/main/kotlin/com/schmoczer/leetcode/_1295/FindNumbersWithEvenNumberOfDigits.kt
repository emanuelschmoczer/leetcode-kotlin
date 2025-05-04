package com.schmoczer.leetcode._1295

class FindNumbersWithEvenNumberOfDigits {
    // Runtime 1ms Beats 100.00%
    fun findNumbers(nums: IntArray): Int {
        var result = 0
        for (number in nums) {
            var digitCount = 0
            var current = number
            while (current > 0) {
                current = current / 10
                digitCount++
            }

            if (digitCount % 2 == 0) {
                result++
            }
        }
        return result
    }
}
