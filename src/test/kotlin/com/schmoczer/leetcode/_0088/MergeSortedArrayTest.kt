package com.schmoczer.leetcode._0088

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class MergeSortedArrayTest {
    private companion object {
        @JvmStatic
        fun sortedArrays() = listOf(
            Arguments.of(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3, intArrayOf(1, 2, 2, 3, 5, 6)),
            Arguments.of(intArrayOf(1), 1, intArrayOf(), 0, intArrayOf(1)),
            Arguments.of(intArrayOf(0), 0, intArrayOf(1), 1, intArrayOf(1)),
        )
    }

    private lateinit var sut: MergeSortedArray

    @BeforeEach
    fun setUp() {
        sut = MergeSortedArray()
    }

    @ParameterizedTest(name = "{0} and {2} should be merged into {4}")
    @MethodSource("sortedArrays")
    fun `two integer arrays should be merged into the first one and be sorted`(
        nums1: IntArray,
        m: Int,
        nums2: IntArray,
        n: Int,
        expected: IntArray,
    ) {
        sut.merge(nums1, m, nums2, n)

        assertContentEquals(expected, nums1)
    }
}
