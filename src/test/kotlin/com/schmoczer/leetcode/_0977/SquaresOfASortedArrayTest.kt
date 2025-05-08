package com.schmoczer.leetcode._0977

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class SquaresOfASortedArrayTest {
    private companion object {
        @JvmStatic
        fun numbersAndSquares() = listOf(
            Arguments.of(intArrayOf(-4, -1, 0, 3, 10), intArrayOf(0, 1, 9, 16, 100)),
            Arguments.of(intArrayOf(-7, -3, 2, 3, 11), intArrayOf(4, 9, 9, 49, 121)),
        )
    }

    private lateinit var sut: SquaresOfASortedArray

    @BeforeEach
    fun setUp() {
        sut = SquaresOfASortedArray()
    }

    @ParameterizedTest(name = "the sorted squares of {0} are {1}")
    @MethodSource("numbersAndSquares")
    fun `returns the squares of the input array sorted in non-decreasing order`(input: IntArray, expected: IntArray) {
        val result = sut.sortedSquares(input)

        assertContentEquals(expected, result)
    }
}
