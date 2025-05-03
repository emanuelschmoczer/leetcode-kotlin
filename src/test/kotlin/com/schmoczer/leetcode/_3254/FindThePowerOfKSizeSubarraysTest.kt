package com.schmoczer.leetcode._3254

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class FindThePowerOfKSizeSubarraysTest {
    private companion object {
        @JvmStatic
        fun subarrayInputs() = listOf(
            Arguments.of(
                intArrayOf(1, 2, 3, 4, 3, 2, 5),
                3,
                intArrayOf(3, 4, -1, -1, -1),
            ),
            Arguments.of(
                intArrayOf(2, 2, 2, 2, 2),
                4,
                intArrayOf(-1, -1),
            ),
            Arguments.of(
                intArrayOf(3, 2, 3, 2, 3, 2),
                2,
                intArrayOf(-1, 3, -1, 3, -1),
            ),
        )
    }

    private lateinit var sut: FindThePowerOfKSizeSubarrays

    @BeforeEach
    fun setUp() {
        sut = FindThePowerOfKSizeSubarrays()
    }

    @ParameterizedTest(name = "power of all sub-arrays of size {1} for input {0} is {2}")
    @MethodSource("subarrayInputs")
    fun `returns the correct power of subarrays`(input: IntArray, k: Int, expected: IntArray) {
        val result = sut.resultsArray(input, k)

        assertContentEquals(expected, result)
    }
}
