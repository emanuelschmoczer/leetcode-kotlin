package com.schmoczer.leetcode._3254

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertContentEquals

class FindThePowerOfKSizeSubarraysTest {
    private lateinit var sut: FindThePowerOfKSizeSubarrays

    @BeforeEach
    fun setUp() {
        sut = FindThePowerOfKSizeSubarrays()
    }

    @Test
    fun `power of all sub-arrays of size 3 of 1,2,3,4,3,2,5 is 3,4,-1,-1,-1`() {
        val input = intArrayOf(1, 2, 3, 4, 3, 2, 5)
        val k = 3
        var expected = intArrayOf(3, 4, -1, -1, -1)

        val result = sut.resultsArray(input, k)

        assertContentEquals(expected, result)
    }

    @Test
    fun `power of all sub-arrays of size 4 of 2,2,2,2,2 is -1,-1`() {
        val input = intArrayOf(2, 2, 2, 2, 2)
        val k = 4
        var expected = intArrayOf(-1, -1)

        val result = sut.resultsArray(input, k)

        assertContentEquals(expected, result)
    }

    @Test
    fun `power of all sub-arrays of size 2 of 3,2,3,2,3,2 is -1,3,-1,3,-1`() {
        val input = intArrayOf(3, 2, 3, 2, 3, 2)
        val k = 2
        var expected = intArrayOf(-1, 3, -1, 3, -1)

        val result = sut.resultsArray(input, k)

        assertContentEquals(expected, result)
    }
}
