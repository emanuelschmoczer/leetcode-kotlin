package com.schmoczer.leetcode._0125

class ValidPalindrome {
    // Approach 1
    fun isPalindrome1(s: String) = s.lowercase()
        .filter { it.isLetter() || it.isDigit() }
        .let { it == it.reversed() }

    // Approach 2: two pointers from each side -> Runtime: 4ms Beats 100.00%
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1
        while (left < right) {
            var leftChar = s.elementAt(left)
            while (leftChar.isDigit().not() && leftChar.isLetter().not() && left < right) {
                left++
                leftChar = s.elementAt(left)
            }
            var rightChar = s.elementAt(right)
            while (rightChar.isDigit().not() && rightChar.isLetter().not() && left < right) {
                right--
                rightChar = s.elementAt(right)
            }
            if (leftChar.lowercaseChar() != rightChar.lowercaseChar()) {
                return false
            }
            left++
            right--
        }
        return true
    }
}
