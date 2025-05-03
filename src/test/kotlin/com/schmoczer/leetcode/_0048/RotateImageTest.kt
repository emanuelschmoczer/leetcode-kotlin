package com.schmoczer.leetcode._0048

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class RotateImageTest {
    private companion object {
        @JvmStatic
        fun matrixInputs() = listOf(
            Arguments.of(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(4, 5, 6),
                    intArrayOf(7, 8, 9),
                ),
                arrayOf(
                    intArrayOf(7, 4, 1),
                    intArrayOf(8, 5, 2),
                    intArrayOf(9, 6, 3),
                ),
            ),
            Arguments.of(
                arrayOf(
                    intArrayOf(5, 1, 9, 11),
                    intArrayOf(2, 4, 8, 10),
                    intArrayOf(13, 3, 6, 7),
                    intArrayOf(15, 14, 12, 16),
                ),
                arrayOf(
                    intArrayOf(15, 13, 2, 5),
                    intArrayOf(14, 3, 4, 1),
                    intArrayOf(12, 6, 8, 9),
                    intArrayOf(16, 7, 10, 11),
                ),
            ),
        )
    }

    private lateinit var sut: RotateImage

    @BeforeEach
    fun setUp() {
        sut = RotateImage()
    }

    @ParameterizedTest(name = "rotated matrix for input {0} is {1}")
    @MethodSource("matrixInputs")
    fun `returns the correct rotated matrix`(input: Array<IntArray>, expected: Array<IntArray>) {
        sut.rotate(input)

        for (i in expected.indices) {
            assertContentEquals(expected[i], input[i])
        }
    }
}
