package com.schmoczer.leetcode._3163

class StringCompression3 {
    fun compressedString(word: String): String {
        var compressed = StringBuilder()
        var letter = ' '
        var count = 0
        for (c in word) {
            if (c == letter) {
                if (count < 9) {
                    count++
                } else {
                    compressed.append(count).append(letter)
                    letter = c
                    count = 1
                }
            } else {
                if (count > 0) {
                    compressed.append(count).append(letter)
                }
                letter = c
                count = 1
            }
        }
        if (count > 0) {
            compressed.append(count).append(letter)
        }
        return compressed.toString()
    }
}
