package com.schmoczer.leetcode._3011

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class FindIfArrayCanBeSortedTest {
    private companion object {
        @JvmStatic
        fun arrayInputs() = listOf(
            Arguments.of(intArrayOf(8, 4, 2, 30, 15), true),
            Arguments.of(intArrayOf(1, 2, 3, 4, 5), true),
            Arguments.of(intArrayOf(3, 16, 8, 4, 2), false),
        )
    }

    private lateinit var sut: FindIfArrayCanBeSorted

    @BeforeEach
    fun setUp() {
        sut = FindIfArrayCanBeSorted()
    }

    @ParameterizedTest(name = "array {0} can be sorted: {1}")
    @MethodSource("arrayInputs")
    fun `checks if array can be sorted`(input: IntArray, expected: Boolean) {
        val result = sut.canSortArray(input)

        assertEquals(expected, result)
    }
}
