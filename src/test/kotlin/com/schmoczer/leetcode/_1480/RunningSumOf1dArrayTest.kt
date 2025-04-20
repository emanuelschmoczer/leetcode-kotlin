package com.schmoczer.leetcode._1480

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertContentEquals

class RunningSumOf1dArrayTest {
    private lateinit var sut: RunningSumOf1dArray

    @BeforeEach
    fun setUp() {
        sut = RunningSumOf1dArray()
    }

    @Test
    fun `given 1,2,3,4 then the running sum is 1,3,6,10`() {
        val input = intArrayOf(1, 2, 3, 4)
        val expected = intArrayOf(1, 3, 6, 10)

        val result = sut.runningSum(input)

        assertContentEquals(expected, result)
    }

    @Test
    fun `given 1,1,1,1,1 then the running sum is 1,2,3,4,5`() {
        val input = intArrayOf(1, 1, 1, 1, 1)
        val expected = intArrayOf(1, 2, 3, 4, 5)

        val result = sut.runningSum(input)

        assertContentEquals(expected, result)
    }

    @Test
    fun `given 3,1,2,10,1 then the running sum is 3,4,6,16,17`() {
        val input = intArrayOf(3, 1, 2, 10, 1)
        val expected = intArrayOf(3, 4, 6, 16, 17)

        val result = sut.runningSum(input)

        assertContentEquals(expected, result)
    }
}
