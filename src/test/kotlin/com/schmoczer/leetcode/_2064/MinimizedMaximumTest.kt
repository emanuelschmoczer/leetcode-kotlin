package com.schmoczer.leetcode._2064

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals

class MinimizedMaximumTest {
    private lateinit var sut: MinimizedMaximum

    @BeforeEach
    fun setUp() {
        sut = MinimizedMaximum()
    }

    @Test
    fun `for 6 retail stores and 11,6 products the minimized maximum number of products is 3`() {
        val quantities = intArrayOf(11, 6)
        val numberOfStores = 6
        val expected = 3

        val result = sut.minimizedMaximum(numberOfStores, quantities)

        assertEquals(expected, result)
    }

    @Test
    fun `for 7 retail stores and 15,10,10 products the minimized maximum number of products is 5`() {
        val quantities = intArrayOf(15, 10, 10)
        val numberOfStores = 7
        val expected = 5

        val result = sut.minimizedMaximum(numberOfStores, quantities)

        assertEquals(expected, result)
    }

    @Test
    fun `for 1 retail store and 100000 products the minimized maximum number of products is 100000`() {
        val quantities = intArrayOf(100000)
        val numberOfStores = 1
        val expected = 100000

        val result = sut.minimizedMaximum(numberOfStores, quantities)

        assertEquals(expected, result)
    }
}
