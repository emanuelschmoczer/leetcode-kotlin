package com.schmoczer.leetcode._0001

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class TwoSumTest {
    private companion object {
        @JvmStatic
        fun twoSumInputs() = listOf(
            Arguments.of(intArrayOf(2, 7, 11, 15), 9, intArrayOf(0, 1)),
            Arguments.of(intArrayOf(3, 2, 4), 6, intArrayOf(1, 2)),
            Arguments.of(intArrayOf(3, 3), 6, intArrayOf(0, 1)),
        )
    }

    private lateinit var sut: TwoSum

    @BeforeEach
    fun setUp() {
        sut = TwoSum()
    }

    @ParameterizedTest(name = "two sum for input {0} with target {1} is {2}")
    @MethodSource("twoSumInputs")
    fun `returns the correct indices for two sum`(input: IntArray, target: Int, expected: IntArray) {
        val result = sut.twoSum(input, target)

        assertContentEquals(expected, result)
    }
}
