package com.schmoczer.leetcode._0773

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals

class SlidingPuzzleTest {
    private lateinit var sut: SlidingPuzzle

    @BeforeEach
    fun setUp() {
        sut = SlidingPuzzle()
    }

    @Test
    fun `board that is solved with 1 move`() {
        val input = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 0, 5))
        val expected = 1

        val result = sut.slidingPuzzle(input)

        assertEquals(expected, result)
    }

    @Test
    fun `unsolvable board`() {
        val input = arrayOf(intArrayOf(1, 2, 3), intArrayOf(5, 4, 0))
        val expected = -1

        val result = sut.slidingPuzzle(input)

        assertEquals(expected, result)
    }

    @Test
    fun `board that is solved with 5 moves`() {
        val input = arrayOf(intArrayOf(4, 1, 2), intArrayOf(5, 0, 3))
        val expected = 5

        val result = sut.slidingPuzzle(input)

        assertEquals(expected, result)
    }
}
