package com.schmoczer.leetcode._2070

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class MostBeautifulItemForEachQueryTest {
    private companion object {
        @JvmStatic
        fun queryInputs() = listOf(
            Arguments.of(
                arrayOf(intArrayOf(1, 2), intArrayOf(3, 2), intArrayOf(2, 4), intArrayOf(5, 6), intArrayOf(3, 5)),
                intArrayOf(1, 2, 3, 4, 5, 6),
                intArrayOf(2, 4, 5, 5, 6, 6),
            ),
            Arguments.of(
                arrayOf(intArrayOf(1, 2), intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(1, 4)),
                intArrayOf(1),
                intArrayOf(4),
            ),
            Arguments.of(
                arrayOf(intArrayOf(10, 1000)),
                intArrayOf(5),
                intArrayOf(0),
            ),
        )
    }

    private lateinit var sut: MostBeautifulItemForEachQuery

    @BeforeEach
    fun setUp() {
        sut = MostBeautifulItemForEachQuery()
    }

    @ParameterizedTest(name = "maximum beauty for items {0} and queries {1} is {2}")
    @MethodSource("queryInputs")
    fun `returns the correct maximum beauty`(items: Array<IntArray>, queries: IntArray, expected: IntArray) {
        val result = sut.maximumBeauty(items, queries)

        assertContentEquals(expected, result)
    }
}
