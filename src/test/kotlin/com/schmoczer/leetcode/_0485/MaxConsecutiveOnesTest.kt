package com.schmoczer.leetcode._0485

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class MaxConsecutiveOnesTest {
    private companion object {
        @JvmStatic
        fun binaryNumbers() = listOf(
            Arguments.of(intArrayOf(1, 1, 0, 1, 1, 1), 3),
            Arguments.of(intArrayOf(1, 0, 1, 1, 0, 1), 2),
            Arguments.of(intArrayOf(0, 0, 0), 0),
        )
    }

    private lateinit var sut: MaxConsecutiveOnes

    @BeforeEach
    fun setUp() {
        sut = MaxConsecutiveOnes()
    }

    @ParameterizedTest(name = "{0} has {1} consecutive ones")
    @MethodSource("binaryNumbers")
    fun `returns the max number of consecutive ones`(input: IntArray, expected: Int) {
        val result = sut.findMaxConsecutiveOnes(input)

        assertEquals(expected, result)
    }
}
