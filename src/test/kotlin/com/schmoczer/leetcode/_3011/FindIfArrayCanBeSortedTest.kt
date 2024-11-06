package com.schmoczer.leetcode._3011

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class FindIfArrayCanBeSortedTest {
    private lateinit var sut: FindIfArrayCanBeSorted

    @BeforeEach
    fun setUp() {
        sut = FindIfArrayCanBeSorted()
    }

    @Test
    fun `8,4,2,30,15 can be sorted`() {
        val input = intArrayOf(8, 4, 2, 30, 15)

        assertTrue(sut.canSortArray(input))
    }

    @Test
    fun `already sorted array can be sorted`() {
        val input = intArrayOf(1, 2, 3, 4, 5)

        assertTrue(sut.canSortArray(input))
    }

    @Test
    fun `3,16,8,4,2 can not be sorted`() {
        val input = intArrayOf(3, 16, 8, 4, 2)

        assertFalse(sut.canSortArray(input))
    }
}
