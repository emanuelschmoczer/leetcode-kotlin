package com.schmoczer.leetcode._0283

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class MoveZeroesTest {
    private companion object {
        @JvmStatic
        fun arraysWithZeroes() = listOf(
            Arguments.of(intArrayOf(0, 1, 0, 3, 12), intArrayOf(1, 3, 12, 0, 0)),
            Arguments.of(intArrayOf(0), intArrayOf(0)),
        )
    }

    private lateinit var sut: MoveZeroes

    @BeforeEach
    fun setUp() {
        sut = MoveZeroes()
    }

    @ParameterizedTest(name = "when moving zeroes in {0} then array becomes {1}")
    @MethodSource("arraysWithZeroes")
    fun `moves zeroes to the end`(input: IntArray, expected: IntArray) {
        sut.moveZeroes(input)

        assertContentEquals(expected, input)
    }
}
