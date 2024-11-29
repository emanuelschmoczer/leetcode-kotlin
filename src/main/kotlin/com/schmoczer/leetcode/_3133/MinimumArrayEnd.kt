package com.schmoczer.leetcode._3133

class MinimumArrayEnd {
    fun minEnd(n: Int, x: Int): Long {
        var count = 0
        var result = x.toLong()
        while (count < n - 1) {
            result = (result + 1) or x.toLong()
            count++
        }
        return result
    }
}
