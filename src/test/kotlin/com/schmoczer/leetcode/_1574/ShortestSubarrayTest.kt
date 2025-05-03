package com.schmoczer.leetcode._1574

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class ShortestSubarrayTest {
    private companion object {
        @JvmStatic
        fun subarrayInputs() = listOf(
            Arguments.of(intArrayOf(1, 2, 3, 10, 4, 2, 3, 5), 3),
            Arguments.of(intArrayOf(5, 4, 3, 2, 1), 4),
            Arguments.of(intArrayOf(1, 2, 3), 0),
            Arguments.of(intArrayOf(10, 13, 17, 21, 15, 15, 9, 17, 22, 22, 13), 7),
        )
    }

    private lateinit var sut: ShortestSubarray

    @BeforeEach
    fun setUp() {
        sut = ShortestSubarray()
    }

    @ParameterizedTest(name = "shortest subarray to make {0} non-decreasing has length {1}")
    @MethodSource("subarrayInputs")
    fun `returns the correct shortest subarray length`(input: IntArray, expected: Int) {
        val result = sut.findLengthOfShortestSubarray(input)

        assertEquals(expected, result)
    }
}
