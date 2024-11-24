package com.schmoczer.leetcode._1975

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumMatrixSumTest {
    private lateinit var sut: MaximumMatrixSum

    @BeforeEach
    fun setUp() {
        sut = MaximumMatrixSum()
    }

    @Test
    fun `a 2x2 matrix with max sum of 4`() {
        val input = arrayOf(intArrayOf(1, -1), intArrayOf(-1, 1))
        val expected: Long = 4

        val result = sut.maxMatrixSum(input)

        assertEquals(expected, result)
    }

    @Test
    fun `a 3x3 matrix with max sum of 16`() {
        val input = arrayOf(intArrayOf(1, 2, 3), intArrayOf(-1, -2, -3), intArrayOf(1, 2, 3))
        val expected: Long = 16

        val result = sut.maxMatrixSum(input)

        assertEquals(expected, result)
    }

    @Test
    fun `a 3x3 matrix with all numbers being -10000 has max sum of 70000`() {
        val input = arrayOf(intArrayOf(-10000, -10000, -10000), intArrayOf(-10000, -10000, -10000), intArrayOf(-10000, -10000, -10000))
        val expected: Long = 70000

        val result = sut.maxMatrixSum(input)

        assertEquals(expected, result)
    }
}
