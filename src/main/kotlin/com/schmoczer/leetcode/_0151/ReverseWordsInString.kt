package com.schmoczer.leetcode._0151

class ReverseWordsInString {
    // Attempt 1
    fun reverseWords1(s: String) = s.split(" ").filterNot { it.isBlank() }.reversed().joinToString(" ")

    // Attempt 2 using a stack
    fun reverseWords(s: String): String {
        var i = 0
        var right = 0
        var left = 0
        val stack = ArrayDeque<String>()
        while (i < s.length) {
            if (left == right && s[i] != ' ') {
                left = i
                right = i + 1
            } else if (left != right && s[i] != ' ') {
                right = i + 1
            } else if (left != right) {
                stack.add(s.substring(left, right))
                left = i
                right = i
            }
            i++
        }
        if (left != right) {
            stack.add(s.substring(left, right))
        }
        return buildString {
            while (stack.isNotEmpty()) {
                append(stack.removeLast())
                append(' ')
            }
            setLength(this.length - 1)
        }
    }
}
