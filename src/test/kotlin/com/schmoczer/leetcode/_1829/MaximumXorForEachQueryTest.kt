package com.schmoczer.leetcode._1829

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertContentEquals

class MaximumXorForEachQueryTest {
    private lateinit var sut: MaximumXorForEachQuery

    @BeforeEach
    fun setUp() {
        sut = MaximumXorForEachQuery()
    }

    @Test
    fun `maximum xor for each query of 0,1,1,3 is 0,3,2,3`() {
        val input = intArrayOf(0, 1, 1, 3)
        val expected = intArrayOf(0, 3, 2, 3)

        val result = sut.getMaximumXor(input, 2)

        assertContentEquals(expected, result)
    }

    @Test
    fun `maximum xor for each query of 2,3,4,7 is 5,2,6,5`() {
        val input = intArrayOf(2, 3, 4, 7)
        val expected = intArrayOf(5, 2, 6, 5)

        val result = sut.getMaximumXor(input, 3)

        assertContentEquals(expected, result)
    }
}
