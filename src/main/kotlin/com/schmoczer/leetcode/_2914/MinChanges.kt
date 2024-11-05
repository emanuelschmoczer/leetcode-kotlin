package com.schmoczer.leetcode._2914

class MinChanges {
    fun minChanges(s: String): Int {
        var changes = 0
        for (i in 2..s.length step 2) {
            val part = s.substring(i - 2, i)
            if (part == "01" || part == "10") {
                changes++
            }
        }
        return changes
    }
}
