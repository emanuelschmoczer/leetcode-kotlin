package com.schmoczer.leetcode._0344

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class ReverseStringTest {
    private companion object {
        @JvmStatic
        fun reverseStringInputs() = listOf(
            Arguments.of(charArrayOf('h', 'e', 'l', 'l', 'o'), charArrayOf('o', 'l', 'l', 'e', 'h')),
            Arguments.of(charArrayOf('H', 'a', 'n', 'n', 'a', 'h'), charArrayOf('h', 'a', 'n', 'n', 'a', 'H')),
        )
    }

    private lateinit var sut: ReverseString

    @BeforeEach
    fun setUp() {
        sut = ReverseString()
    }

    @ParameterizedTest(name = "\"{0}\" reversed is \"{1}\"")
    @MethodSource("reverseStringInputs")
    fun `reverses the string correctly`(input: CharArray, expected: CharArray) {
        sut.reverseString(input)

        assertContentEquals(expected, input)
    }
}
