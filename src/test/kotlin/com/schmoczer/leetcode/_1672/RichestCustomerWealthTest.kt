package com.schmoczer.leetcode._1672

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class RichestCustomerWealthTest {
    private companion object {
        @JvmStatic
        fun customerWealths() = listOf(
            Arguments.of(arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1)), 6),
            Arguments.of(arrayOf(intArrayOf(1, 5), intArrayOf(7, 3), intArrayOf(3, 5)), 10),
            Arguments.of(arrayOf(intArrayOf(2, 8, 7), intArrayOf(7, 1, 3), intArrayOf(1, 9, 5)), 17),
        )
    }

    private lateinit var sut: RichestCustomerWealth

    @BeforeEach
    fun setUp() {
        sut = RichestCustomerWealth()
    }

    @ParameterizedTest(name = "richest customer wealth for {0} is {1}")
    @MethodSource("customerWealths")
    fun `returns the richest customer wealth`(accounts: Array<IntArray>, expected: Int) {
        val result = sut.maximumWealth(accounts)

        assertEquals(expected, result)
    }
}
