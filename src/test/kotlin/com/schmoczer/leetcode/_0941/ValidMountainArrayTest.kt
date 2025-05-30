package com.schmoczer.leetcode._0941

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class ValidMountainArrayTest {
    private companion object {
        @JvmStatic
        fun mountainArrays() = listOf(
            Arguments.of(intArrayOf(2, 1), false),
            Arguments.of(intArrayOf(3, 5, 5), false),
            Arguments.of(intArrayOf(0, 3, 2, 1), true),
        )
    }

    private lateinit var sut: ValidMountainArray

    @BeforeEach
    fun setUp() {
        sut = ValidMountainArray()
    }

    @ParameterizedTest(name = "{0} is a mountain array: {1}")
    @MethodSource("mountainArrays")
    fun `returns true if it is a valid mountain array`(input: IntArray, expected: Boolean) {
        val result = sut.validMountainArray(input)

        assertEquals(expected, result)
    }
}
