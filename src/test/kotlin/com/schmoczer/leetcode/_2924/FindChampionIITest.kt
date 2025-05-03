package com.schmoczer.leetcode._2924

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class FindChampionIITest {
    private companion object {
        @JvmStatic
        fun championInputs() = listOf(
            Arguments.of(3, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2)), 0),
            Arguments.of(4, arrayOf(intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(1, 2)), -1),
        )
    }

    private lateinit var sut: FindChampionII

    @BeforeEach
    fun setUp() {
        sut = FindChampionII()
    }

    @ParameterizedTest(name = "champion for n = {0} and input {1} is {2}")
    @MethodSource("championInputs")
    fun `returns the correct champion`(n: Int, input: Array<IntArray>, expected: Int) {
        val result = sut.findChampion(n, input)

        assertEquals(expected, result)
    }
}
