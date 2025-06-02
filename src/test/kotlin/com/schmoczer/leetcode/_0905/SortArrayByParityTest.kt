package com.schmoczer.leetcode._0905

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class SortArrayByParityTest {
    private companion object {
        @JvmStatic
        fun unsortedAndSorted() = listOf(
            Arguments.of(intArrayOf(3, 1, 2, 4), intArrayOf(2, 4, 3, 1)),
            Arguments.of(intArrayOf(0), intArrayOf(0)),
        )
    }

    private lateinit var sut: SortArrayByParity

    @BeforeEach
    fun setUp() {
        sut = SortArrayByParity()
    }

    @ParameterizedTest(name = "{0} sorted by parity is {1}")
    @MethodSource("unsortedAndSorted")
    fun `returns the array sorted by parity`(input: IntArray, expected: IntArray) {
        val result = sut.sortArrayByParity(input)

        assertContentEquals(expected, result)
    }
}
