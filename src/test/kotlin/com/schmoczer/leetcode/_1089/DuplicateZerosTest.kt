package com.schmoczer.leetcode._1089

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class DuplicateZerosTest {
    private companion object {
        @JvmStatic
        fun inputAndDuplicatedZeros() = listOf(
            Arguments.of(intArrayOf(1, 0, 2, 3, 0, 4, 5, 0), intArrayOf(1, 0, 0, 2, 3, 0, 0, 4)),
            Arguments.of(intArrayOf(1, 2, 3), intArrayOf(1, 2, 3)),
        )
    }

    private lateinit var sut: DuplicateZeros

    @BeforeEach
    fun setUp() {
        sut = DuplicateZeros()
    }

    @ParameterizedTest(name = "{0} with duplicate zeros is {1}")
    @MethodSource("inputAndDuplicatedZeros")
    fun `input array is modified in place to duplicate all zeroes`(input: IntArray, expected: IntArray) {
        sut.duplicateZeros(input)

        assertContentEquals(expected, input)
    }
}
