package com.schmoczer.leetcode._2070

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertContentEquals

class MostBeautifulItemForEachQueryTest {
    private lateinit var sut: MostBeautifulItemForEachQuery

    @BeforeEach
    fun setUp() {
        sut = MostBeautifulItemForEachQuery()
    }

    @Test
    fun `array with different prices`() {
        val items = arrayOf(intArrayOf(1, 2), intArrayOf(3, 2), intArrayOf(2, 4), intArrayOf(5, 6), intArrayOf(3, 5))
        val queries = intArrayOf(1, 2, 3, 4, 5, 6)
        val expected = intArrayOf(2, 4, 5, 5, 6, 6)

        val result = sut.maximumBeauty(items, queries)

        assertContentEquals(expected, result)
    }

    @Test
    fun `array where all items have the same price`() {
        val items = arrayOf(intArrayOf(1, 2), intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(1, 4))
        val queries = intArrayOf(1)
        val expected = intArrayOf(4)

        val result = sut.maximumBeauty(items, queries)

        assertContentEquals(expected, result)
    }

    @Test
    fun `array where no price fulfills the query`() {
        val items = arrayOf(intArrayOf(10, 1000))
        val queries = intArrayOf(5)
        val expected = intArrayOf(0)

        val result = sut.maximumBeauty(items, queries)

        assertContentEquals(expected, result)
    }
}
