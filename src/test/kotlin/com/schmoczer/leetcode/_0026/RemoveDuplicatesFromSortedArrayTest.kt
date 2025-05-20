package com.schmoczer.leetcode._0026

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class RemoveDuplicatesFromSortedArrayTest {
    private companion object {
        @JvmStatic
        fun numbersAndOutput() = listOf(
            Arguments.of(intArrayOf(1, 1, 2), 2, intArrayOf(1, 2)),
            Arguments.of(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4), 5, intArrayOf(0, 1, 2, 3, 4)),
        )
    }

    private lateinit var sut: RemoveDuplicatesFromSortedArray

    @BeforeEach
    fun setUp() {
        sut = RemoveDuplicatesFromSortedArray()
    }

    @ParameterizedTest(name = "when removing duplicates from {0} then the first {1} elements are {2}")
    @MethodSource("numbersAndOutput")
    fun `returns the number of unique elements`(input: IntArray, expectedResult: Int, expectedNumbers: IntArray) {
        val result = sut.removeDuplicates(input)

        assertEquals(expectedResult, result)
        for (i in 0 until result) {
            assertEquals(expectedNumbers[i], input[i])
        }
    }
}
