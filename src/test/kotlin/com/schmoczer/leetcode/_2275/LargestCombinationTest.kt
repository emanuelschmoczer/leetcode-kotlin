package com.schmoczer.leetcode._2275

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals

class LargestCombinationTest {
    private lateinit var sut: LargestCombination

    @BeforeEach
    fun setUp() {
        sut = LargestCombination()
    }

    @Test
    fun `largest combination of 16,17,71,62,12,24,14 is 4`() {
        val input = intArrayOf(16, 17, 71, 62, 12, 24, 14)

        assertEquals(4, sut.largestCombination(input))
    }

    @Test
    fun `largest combination fo 8,8 is 2`() {
        val input = intArrayOf(8, 8)

        assertEquals(2, sut.largestCombination(input))
    }
}
