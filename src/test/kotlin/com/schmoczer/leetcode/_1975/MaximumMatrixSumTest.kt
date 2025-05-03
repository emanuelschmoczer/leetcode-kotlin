package com.schmoczer.leetcode._1975

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class MaximumMatrixSumTest {
    private companion object {
        @JvmStatic
        fun matrixInputs() = listOf(
            Arguments.of(
                arrayOf(intArrayOf(1, -1), intArrayOf(-1, 1)),
                4L,
            ),
            Arguments.of(
                arrayOf(intArrayOf(1, 2, 3), intArrayOf(-1, -2, -3), intArrayOf(1, 2, 3)),
                16L,
            ),
            Arguments.of(
                arrayOf(
                    intArrayOf(-10000, -10000, -10000),
                    intArrayOf(-10000, -10000, -10000),
                    intArrayOf(-10000, -10000, -10000),
                ),
                70000L,
            ),
        )
    }

    private lateinit var sut: MaximumMatrixSum

    @BeforeEach
    fun setUp() {
        sut = MaximumMatrixSum()
    }

    @ParameterizedTest(name = "maximum matrix sum for input {0} is {1}")
    @MethodSource("matrixInputs")
    fun `returns the correct maximum matrix sum`(matrix: Array<IntArray>, expected: Long) {
        val result = sut.maxMatrixSum(matrix)

        assertEquals(expected, result)
    }
}
