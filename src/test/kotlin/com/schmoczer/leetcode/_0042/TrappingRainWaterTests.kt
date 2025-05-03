package com.schmoczer.leetcode._0042

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class TrappingRainWaterTests {
    private companion object {
        @JvmStatic
        fun waterInputs() = listOf(
            Arguments.of(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1), 6),
            Arguments.of(intArrayOf(4, 2, 0, 3, 2, 5), 9),
            Arguments.of(intArrayOf(0, 0, 0, 0), 0),
            Arguments.of(intArrayOf(2, 0, 2), 2),
        )
    }

    private lateinit var sut: TrappingRainWater

    @BeforeEach
    fun setUp() {
        sut = TrappingRainWater()
    }

    @ParameterizedTest(name = "trapped water for heights {0} is {1}")
    @MethodSource("waterInputs")
    fun `returns the correct amount of trapped water`(heights: IntArray, expected: Int) {
        val result = sut.trap(heights)

        assertEquals(expected, result)
    }
}
