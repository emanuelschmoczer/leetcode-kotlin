package com.schmoczer.leetcode._0186

class ReverseWordsInStringInPlace {
    // Runtime 2ms Beats 100.00%
    fun reverseWords(s: CharArray) {
        fun reverseString(s: CharArray, begin: Int, end: Int) {
            var i = begin
            while (i < (end + begin) / 2) {
                val j = (end + begin) - 1 - i
                s[i] = (s[i].code xor s[j].code).toChar()
                s[j] = (s[j].code xor s[i].code).toChar()
                s[i] = (s[i].code xor s[j].code).toChar()
                i++
            }
        }

        // reverse whole sentence first
        reverseString(s, 0, s.size)
        // then reverse each word
        var last = 0
        for (i in 0..s.size - 1) {
            if (s[i] == ' ') {
                reverseString(s, last, i)
                last = i + 1
            }
        }
        reverseString(s, last, s.size)
    }
}
