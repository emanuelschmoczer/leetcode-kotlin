package com.schmoczer.leetcode._2064

class MinimizedMaximum {
    fun minimizedMaximum(n: Int, quantities: IntArray): Int {
        var left = 0
        var right = quantities.max()
        while (left < right) {
            val middle = (left + right) / 2
            if (canDistribute(middle, n, quantities)) {
                right = middle
            } else {
                left = middle + 1
            }
        }
        return left
    }

    private fun canDistribute(x: Int, n: Int, quantities: IntArray): Boolean {
        var j = 0
        var remaining = quantities.first()
        for (i in 0 until n) {
            if (remaining <= x) {
                j++
                if (j == quantities.size) {
                    return true
                }
                remaining = quantities[j]
            } else {
                remaining -= x
            }
        }
        return false
    }
}
