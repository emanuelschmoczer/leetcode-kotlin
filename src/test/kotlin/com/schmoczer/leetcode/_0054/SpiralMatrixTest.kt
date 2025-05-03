package com.schmoczer.leetcode._0054

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class SpiralMatrixTest {
    private companion object {
        @JvmStatic
        fun matrixInputs() = listOf(
            Arguments.of(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(4, 5, 6),
                    intArrayOf(7, 8, 9),
                ),
                listOf(1, 2, 3, 6, 9, 8, 7, 4, 5),
            ),
            Arguments.of(
                arrayOf(
                    intArrayOf(1, 2, 3, 4),
                    intArrayOf(5, 6, 7, 8),
                    intArrayOf(9, 10, 11, 12),
                ),
                listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7),
            ),
            Arguments.of(
                arrayOf(intArrayOf(1)),
                listOf(1),
            ),
        )
    }

    private lateinit var sut: SpiralMatrix

    @BeforeEach
    fun setUp() {
        sut = SpiralMatrix()
    }

    @ParameterizedTest(name = "spiral order for matrix {0} is {1}")
    @MethodSource("matrixInputs")
    fun `returns the correct spiral order`(matrix: Array<IntArray>, expected: List<Int>) {
        val result = sut.spiralOrder(matrix)

        assertContentEquals(expected, result)
    }
}
