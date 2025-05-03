package com.schmoczer.leetcode._3133

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class MinimumArrayEndTest {
    private companion object {
        @JvmStatic
        fun arrayEndInputs() = listOf(
            Arguments.of(3, 4, 6L),
            Arguments.of(2, 7, 15L),
        )
    }

    private lateinit var sut: MinimumArrayEnd

    @BeforeEach
    fun setUp() {
        sut = MinimumArrayEnd()
    }

    @ParameterizedTest(name = "when n = {0} and x = {1} then array end is {2}")
    @MethodSource("arrayEndInputs")
    fun `returns the correct array end`(n: Int, x: Int, expected: Long) {
        val result = sut.minEnd(n, x)

        assertEquals(expected, result)
    }
}
