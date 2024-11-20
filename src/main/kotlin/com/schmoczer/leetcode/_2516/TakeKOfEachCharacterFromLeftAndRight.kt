package com.schmoczer.leetcode._2516

import kotlin.math.max

class TakeKOfEachCharacterFromLeftAndRight {
    // Runtime 22ms Beats 100.00%
    fun takeCharacters(s: String, k: Int): Int {
        var aCount = 0
        var bCount = 0
        var cCount = 0
        for (c in s) {
            when (c) {
                'a' -> aCount++
                'b' -> bCount++
                'c' -> cCount++
            }
        }
        if (aCount < k || bCount < k || cCount < k) {
            return -1
        }

        val length = s.length
        var maxWindow = 0
        var left = 0
        for (right in 0 until length) {
            val rightChar = s[right]
            when (rightChar) {
                'a' -> aCount--
                'b' -> bCount--
                'c' -> cCount--
            }

            while (left <= right && (aCount < k || bCount < k || cCount < k)) {
                val leftChar = s[left]
                when (leftChar) {
                    'a' -> aCount++
                    'b' -> bCount++
                    'c' -> cCount++
                }
                left++
            }
            maxWindow = max(maxWindow, right - left + 1)
        }
        return length - maxWindow
    }
}
