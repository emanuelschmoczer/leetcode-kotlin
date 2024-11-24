package com.schmoczer.leetcode._1975

import kotlin.math.abs

class MaximumMatrixSum {
    // Attempt 1
    fun maxMatrixSum1(matrix: Array<IntArray>): Long {
        val countOfMinus = matrix.sumOf { it.count { it < 0 } }
        var maxSum: Long = 0
        for (row in matrix) {
            for (number in row) {
                maxSum += abs(number)
            }
        }
        return if (countOfMinus % 2 == 0) {
            maxSum
        } else {
            val minNumber = matrix.minOf { it.minOf { abs(it) } }
            maxSum - 2 * minNumber
        }
    }

    // Attempt 2: Runtime 9ms Beats 100.00%
    fun maxMatrixSum(matrix: Array<IntArray>): Long {
        var countOfMinus = 0
        var minNumber = Int.MAX_VALUE
        var maxSum: Long = 0
        for (row in matrix) {
            for (number in row) {
                maxSum += abs(number)
                if (number < 0) {
                    countOfMinus++
                }
                if (abs(number) < minNumber) {
                    minNumber = abs(number)
                }
            }
        }
        return if (countOfMinus % 2 == 0) {
            maxSum
        } else {
            maxSum - 2 * minNumber
        }
    }
}
