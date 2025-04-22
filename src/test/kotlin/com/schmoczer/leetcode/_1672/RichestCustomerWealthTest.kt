package com.schmoczer.leetcode._1672

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test

class RichestCustomerWealthTest {
    private lateinit var sut: RichestCustomerWealth

    @BeforeEach
    fun setUp() {
        sut = RichestCustomerWealth()
    }

    @Test
    fun `given two accounts 1,2,3 and 3,2,1 then richest customer wealth is 6`() {
        val input = arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1))
        val expected = 6

        val result = sut.maximumWealth(input)

        assertEquals(expected, result)
    }

    @Test
    fun `given three accounts 1,5 and 7,3 and 3,5 then richest customer wealth is 10`() {
        val input = arrayOf(intArrayOf(1, 5), intArrayOf(7, 3), intArrayOf(3, 5))
        val expected = 10

        val result = sut.maximumWealth(input)

        assertEquals(expected, result)
    }

    @Test
    fun `given three accounts 2,8,7 and 7,1,3 and 1,9,5 then richest customer wealth is 17`() {
        val input = arrayOf(intArrayOf(2, 8, 7), intArrayOf(7, 1, 3), intArrayOf(1, 9, 5))
        val expected = 17

        val result = sut.maximumWealth(input)

        assertEquals(expected, result)
    }
}
