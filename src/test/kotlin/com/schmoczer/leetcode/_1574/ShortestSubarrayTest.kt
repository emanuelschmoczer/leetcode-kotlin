package com.schmoczer.leetcode._1574

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals

class ShortestSubarrayTest {
    private lateinit var sut: ShortestSubarray

    @BeforeEach
    fun setUp() {
        sut = ShortestSubarray()
    }

    @Test
    fun `the shortest sub-array to make 1,2,3,10,4,2,3,5 non-decreasing has length 3`() {
        val input = intArrayOf(1, 2, 3, 10, 4, 2, 3, 5)
        val expected = 3

        val result = sut.findLengthOfShortestSubarray(input)

        assertEquals(expected, result)
    }

    @Test
    fun `the shortest sub-array to make 5,4,3,2,1 non-decreasing is has length 4`() {
        val input = intArrayOf(5, 4, 3, 2, 1)
        val expected = 4

        val result = sut.findLengthOfShortestSubarray(input)

        assertEquals(expected, result)
    }

    @Test
    fun `the shortest sub-array to make 1,2,3 non-decreasing is has length 0`() {
        val input = intArrayOf(1, 2, 3)
        val expected = 0

        val result = sut.findLengthOfShortestSubarray(input)

        assertEquals(expected, result)
    }

    @Test
    fun `the shortest sub-array to make 10,13,17,21,15,15,9,17,22,22,13 non-decreasing is has length 7`() {
        val input = intArrayOf(10, 13, 17, 21, 15, 15, 9, 17, 22, 22, 13)
        val expected = 7

        val result = sut.findLengthOfShortestSubarray(input)

        assertEquals(expected, result)
    }
}
