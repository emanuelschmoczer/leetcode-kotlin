package com.schmoczer.leetcode._1299

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class ReplaceElementsWithGreatestElementOnRightSideTest {
    private companion object {
        @JvmStatic
        fun arrays() = listOf(
            Arguments.of(intArrayOf(17, 18, 5, 4, 6, 1), intArrayOf(18, 6, 6, 6, 1, -1)),
            Arguments.of(intArrayOf(400), intArrayOf(-1)),
        )
    }

    private lateinit var sut: ReplaceElementsWithGreatestElementOnRightSide

    @BeforeEach
    fun setUp() {
        sut = ReplaceElementsWithGreatestElementOnRightSide()
    }

    @ParameterizedTest(name = "when replacing all elements in {0} with the greatest element on the right side return {1}")
    @MethodSource("arrays")
    fun `returns the array elements replaced`(input: IntArray, expected: IntArray) {
        val result = sut.replaceElements(input)

        assertContentEquals(expected, result)
    }
}
