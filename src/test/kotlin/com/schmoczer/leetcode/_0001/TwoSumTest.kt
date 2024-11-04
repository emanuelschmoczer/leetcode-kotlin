package com.schmoczer.leetcode._0001

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertContentEquals

class TwoSumTest {
    private lateinit var sut: TwoSum

    @BeforeEach
    fun setUp() {
        sut = TwoSum()
    }

    @Test
    fun `first and second index of 2,7,11,15 lead for target of 9`() {
        val input = intArrayOf(2, 7, 11, 15)
        val expected = intArrayOf(0, 1)

        assertContentEquals(expected, sut.twoSum(input, 9))
    }

    @Test
    fun `second and third index of 3,2,4 for target of 6`() {
        val input = intArrayOf(3, 2, 4)
        val expected = intArrayOf(1, 2)

        assertContentEquals(expected, sut.twoSum(input, 6))
    }

    @Test
    fun `first and second index of 3,3 for target of 6`() {
        val input = intArrayOf(3, 3)
        val expected = intArrayOf(0, 1)

        assertContentEquals(expected, sut.twoSum(input, 6))
    }
}
