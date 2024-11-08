package com.schmoczer.leetcode._1829

import kotlin.math.pow

class MaximumXorForEachQuery {
    fun getMaximumXor(nums: IntArray, maximumBit: Int): IntArray {
        val result = IntArray(nums.size) { 0 }
        var queries = mutableMapOf<Int, Int>()
        val maxBitsValue = 2.0.pow(maximumBit).toInt() - 1

        for (query in (0 until nums.size).reversed()) {
            val previous = queries[query + 1] ?: 0
            val value = nums[nums.size - 1 - query] xor previous
            queries[query] = value
            val k = value xor maxBitsValue
            result[query] = k
        }
        return result
    }
}
