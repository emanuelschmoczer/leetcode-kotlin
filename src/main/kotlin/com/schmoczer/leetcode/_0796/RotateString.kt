package com.schmoczer.leetcode._0796

class RotateString {
    // Attempt 1
    fun rotateString1(s: String, goal: String): Boolean {
        if (s.length != goal.length) {
            return false
        }
        if (s == goal) {
            return true
        }

        var s = s
        for (i in 0..s.length - 1) {
            var temp = s.substring(0, 1)
            s = s.drop(1) + temp
            if (s == goal) {
                return true
            }
        }
        return false
    }

    // Attempt 2: Runtime 1ms Beats 100.00%
    fun rotateString2(s: String, goal: String): Boolean {
        if (s.length != goal.length) {
            return false
        }

        for (i in 0..s.length - 1) {
            if ((s.substring(i, s.length) + s.substring(0, i)) == goal) {
                return true
            }
        }
        return false
    }

    // Attempt 3: concatenation check
    fun rotateString(s: String, goal: String) = s.length == goal.length && (s + s).contains(goal)
}
