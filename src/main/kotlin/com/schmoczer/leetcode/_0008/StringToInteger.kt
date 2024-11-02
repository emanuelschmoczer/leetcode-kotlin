package com.schmoczer.leetcode._0008

class StringToInteger {
    // Attempt 1
    fun myAtoi1(s: String): Int {
        var trimmed = s.trimStart()
        if (trimmed.isEmpty() || trimmed.first().isLetter()) {
            return 0
        }

        var isNegative = false
        var returnValue = 0
        if (trimmed.first() == '+') {
            trimmed = trimmed.drop(1)
        } else if (trimmed.first() == '-') {
            isNegative = true
            trimmed = trimmed.drop(1)
        }

        for (c in trimmed) {
            if (c.isDigit().not()) {
                return if (isNegative) -returnValue else returnValue
            }
            if (returnValue > Int.MAX_VALUE / 10) {
                return if (isNegative) Int.MIN_VALUE else Int.MAX_VALUE
            }
            val newNumber = c.digitToInt()
            if (returnValue == Int.MAX_VALUE / 10) {
                if (newNumber > 7) {
                    return if (isNegative) Int.MIN_VALUE else Int.MAX_VALUE
                }
            }
            returnValue = returnValue * 10 + newNumber
        }
        return if (isNegative) -returnValue else returnValue
    }

    // Attempt 2 -> Runtime 2ms Beats 100.00%
    fun myAtoi(s: String): Int {
        var i = 0
        while (i < s.length && s[i] == ' ') {
            i++
        }
        if (i == s.length) {
            return 0
        }
        var isNegative = false
        if (s[i] == '+') {
            i++
        } else if (s[i] == '-') {
            isNegative = true
            i++
        }

        var returnValue = 0
        while (i < s.length && s[i] in '0'..'9') {
            val newNumber = s[i] - '0'
            if (returnValue > (Int.MAX_VALUE - newNumber) / 10) {
                return if (isNegative) Int.MIN_VALUE else Int.MAX_VALUE
            }
            returnValue = returnValue * 10 + newNumber
            i++
        }
        return if (isNegative) -returnValue else returnValue
    }
}
