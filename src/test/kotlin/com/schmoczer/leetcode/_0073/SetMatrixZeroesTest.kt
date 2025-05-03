package com.schmoczer.leetcode._0073

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class SetMatrixZeroesTest {
    private companion object {
        @JvmStatic
        fun matrixInputs() = listOf(
            Arguments.of(
                arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 1)),
                arrayOf(intArrayOf(1, 0, 1), intArrayOf(0, 0, 0), intArrayOf(1, 0, 1)),
            ),
            Arguments.of(
                arrayOf(intArrayOf(0, 1, 2, 0), intArrayOf(3, 4, 5, 2), intArrayOf(1, 3, 1, 5)),
                arrayOf(intArrayOf(0, 0, 0, 0), intArrayOf(0, 4, 5, 0), intArrayOf(0, 3, 1, 0)),
            ),
        )
    }

    private lateinit var sut: SetMatrixZeroes

    @BeforeEach
    fun setUp() {
        sut = SetMatrixZeroes()
    }

    @ParameterizedTest(name = "set zeroes for matrix {0} results in {1}")
    @MethodSource("matrixInputs")
    fun `returns the correct matrix after setting zeroes`(input: Array<IntArray>, expected: Array<IntArray>) {
        sut.setZeroes(input)

        for (i in expected.indices) {
            assertContentEquals(expected[i], input[i])
        }
    }
}
