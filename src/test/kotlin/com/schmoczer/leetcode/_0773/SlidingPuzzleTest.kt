package com.schmoczer.leetcode._0773

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class SlidingPuzzleTest {
    private companion object {
        @JvmStatic
        fun puzzleInputs() = listOf(
            Arguments.of(
                arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 0, 5)),
                1,
            ),
            Arguments.of(
                arrayOf(intArrayOf(1, 2, 3), intArrayOf(5, 4, 0)),
                -1,
            ),
            Arguments.of(
                arrayOf(intArrayOf(4, 1, 2), intArrayOf(5, 0, 3)),
                5,
            ),
        )
    }

    private lateinit var sut: SlidingPuzzle

    @BeforeEach
    fun setUp() {
        sut = SlidingPuzzle()
    }

    @ParameterizedTest(name = "sliding puzzle for board {0} requires {1} moves")
    @MethodSource("puzzleInputs")
    fun `returns the correct number of moves`(board: Array<IntArray>, expected: Int) {
        val result = sut.slidingPuzzle(board)

        assertEquals(expected, result)
    }
}
