package com.schmoczer.leetcode._2490

class CircularSentence {
    fun isCircularSentence(sentence: String): Boolean {
        val words = sentence.split(" ")
        var i = 0
        while (i < words.size) {
            val j = if (i + 1 == words.size) 0 else i + 1
            if (words[i].last() != words[j].first()) {
                return false
            }
            i++
        }
        return true
    }
}
