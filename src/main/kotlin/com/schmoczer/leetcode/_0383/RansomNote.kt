package com.schmoczer.leetcode._0383

class RansomNote {
    // Approach 1: remove letters from magazine, simple & intuitive
    fun canConstruct1(ransomNote: String, magazine: String): Boolean {
        val magazine = magazine.toMutableList()
        for (letter in ransomNote) {
            if (!magazine.remove(letter)) {
                return false
            }
        }
        return true
    }

    // Approach 2: map occurrences of a letter into a IntArray
    // Runtime 3ms Beats 98.51%
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val alphabet = IntArray(123)
        for (letter in magazine) {
            alphabet[letter.code]++
        }

        for (letter in ransomNote) {
            if (alphabet[letter.code] == 0) {
                return false
            }
            alphabet[letter.code]--
        }

        return true
    }
}
