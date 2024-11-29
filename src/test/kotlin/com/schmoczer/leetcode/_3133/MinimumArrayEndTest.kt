package com.schmoczer.leetcode._3133

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumArrayEndTest {
    private lateinit var sut: MinimumArrayEnd

    @BeforeEach
    fun setUp() {
        sut = MinimumArrayEnd()
    }

    @Test
    fun `when n = 3 and x = 4 then array end is 6`() {
        val n = 3
        val x = 4
        val expected: Long = 6

        val result = sut.minEnd(n, x)

        assertEquals(expected, result)
    }

    @Test
    fun `when n = 2 and x = 7 then array end is 15`() {
        val n = 2
        val x = 7
        val expected: Long = 15

        val result = sut.minEnd(n, x)

        assertEquals(expected, result)
    }
}
