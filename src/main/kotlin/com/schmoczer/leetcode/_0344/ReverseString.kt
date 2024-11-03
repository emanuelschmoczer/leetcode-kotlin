package com.schmoczer.leetcode._0344

class ReverseString {
    // Attempt 1
    fun reverseString1(s: CharArray) {
        s.reverse()
    }

    // Attempt 2: Runtime 1ms Beats 100.00%
    fun reverseString2(s: CharArray) {
        var i = 0
        while (i < s.size / 2) {
            val j = s.size - 1 - i
            val c = s[i]
            s[i] = s[j]
            s[j] = c
            i++
        }
    }

    // Attemp 3: using xor, therfore no temp variable needed
    fun reverseString(s: CharArray) {
        var i = 0
        while (i < s.size / 2) {
            val j = s.size - 1 - i
            s[i] = (s[i].code xor s[j].code).toChar()
            s[j] = (s[j].code xor s[i].code).toChar()
            s[i] = (s[i].code xor s[j].code).toChar()
            i++
        }
    }
}
