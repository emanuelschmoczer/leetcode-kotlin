package com.schmoczer.leetcode._0005

class LongestPalindromicSubstring {
    // Attempt 1: bruteforce
    fun longestPalindrome1(s: String): String {
        var longest = ""
        for (i in 0 until s.length) {
            for (j in (i + 1..s.length).reversed()) {
                val sub = s.substring(i, j)
                if (sub.isPalindrome() && sub.length > longest.length) {
                    longest = sub
                    break
                }
            }
        }
        return longest
    }

    // Approach2: dynamic programming
    fun longestPalindrome(s: String): String {
        val knownPalindromes = Array(s.length) { Array<Boolean>(s.length) { false } }
        var longest = ""

        for (i in 0 until s.length) {
            for (j in i until s.length) {
                val k = j - i
                if (i == 0) {
                    knownPalindromes[k][j] = true
                } else if (i == 1) {
                    knownPalindromes[k][j] = (s[k] == s[j])
                } else {
                    knownPalindromes[k][j] = (s[k] == s[j] && knownPalindromes[k + 1][j - 1])
                }
                if (knownPalindromes[k][j] && j - k + 1 > longest.length) {
                    longest = s.substring(k, j + 1)
                }
            }
        }
        return longest
    }
}

private fun String.isPalindrome(): Boolean {
    var left = 0
    var right = length - 1
    while (left < right) {
        var leftChar = elementAt(left)
        while (leftChar.isDigit().not() && leftChar.isLetter().not() && left < right) {
            left++
            leftChar = elementAt(left)
        }
        var rightChar = elementAt(right)
        while (rightChar.isDigit().not() && rightChar.isLetter().not() && left < right) {
            right--
            rightChar = elementAt(right)
        }
        if (leftChar.lowercaseChar() != rightChar.lowercaseChar()) {
            return false
        }
        left++
        right--
    }
    return true
}
