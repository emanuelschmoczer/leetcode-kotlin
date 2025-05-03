package com.schmoczer.leetcode._1829

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class MaximumXorForEachQueryTest {
    private companion object {
        @JvmStatic
        fun xorInputs() = listOf(
            Arguments.of(
                intArrayOf(0, 1, 1, 3),
                2,
                intArrayOf(0, 3, 2, 3),
            ),
            Arguments.of(
                intArrayOf(2, 3, 4, 7),
                3,
                intArrayOf(5, 2, 6, 5),
            ),
        )
    }

    private lateinit var sut: MaximumXorForEachQuery

    @BeforeEach
    fun setUp() {
        sut = MaximumXorForEachQuery()
    }

    @ParameterizedTest(name = "maximum xor for input {0} with maximum bit {1} is {2}")
    @MethodSource("xorInputs")
    fun `returns the correct maximum xor for each query`(input: IntArray, maximumBit: Int, expected: IntArray) {
        val result = sut.getMaximumXor(input, maximumBit)

        assertContentEquals(expected, result)
    }
}
