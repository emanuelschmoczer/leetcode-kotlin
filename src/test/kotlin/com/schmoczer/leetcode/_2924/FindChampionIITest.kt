package com.schmoczer.leetcode._2924

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals

class FindChampionIITest {
    private lateinit var sut: FindChampionII

    @BeforeEach
    fun setUp() {
        sut = FindChampionII()
    }

    @Test
    fun `the champion for 0,1 and 1,2 is 0`() {
        val input = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2))
        val n = 3
        val expected = 0

        val result = sut.findChampion(n, input)

        assertEquals(expected, result)
    }

    @Test
    fun `the champion for 0,2 and 1,3 and 1,2 is -1`() {
        val input = arrayOf(intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(1, 2))
        val n = 4
        val expected = -1

        val result = sut.findChampion(n, input)

        assertEquals(expected, result)
    }
}
