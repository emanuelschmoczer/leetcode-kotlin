package com.schmoczer.leetcode._0020

import java.util.Stack

class ValidParentheses {
    // Attempt 1
    fun isValid1(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for (c in s) {
            when (c) {
                '(', '[', '{' -> stack.addLast(c)
                ')' -> {
                    val openingBracket = stack.removeLastOrNull()
                    if (openingBracket != '(') {
                        return false
                    }
                }

                ']' -> {
                    val openingBracket = stack.removeLastOrNull()
                    if (openingBracket != '[') {
                        return false
                    }
                }

                '}' -> {
                    val openingBracket = stack.removeLastOrNull()
                    if (openingBracket != '{') {
                        return false
                    }
                }
            }
        }
        return stack.isEmpty()
    }

    // Attempt 2: Runtime 3ms Beats 97.28%
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (i in 0 until s.length) {
            val c = s[i]
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c)
            } else {
                if (stack.isEmpty()) {
                    return false
                }
                val openingBracket = stack.pop()
                if ((c == ')' && openingBracket != '(') || (c == ']' && openingBracket != '[') || (c == '}' && openingBracket != '{')) {
                    return false
                }
            }
        }
        return stack.isEmpty()
    }
}
