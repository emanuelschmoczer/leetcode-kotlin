package com.schmoczer.leetcode._0412

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class FizzBuzzTest {
    private companion object {
        @JvmStatic
        fun fizzesAndBuzzes() = listOf(
            Arguments.of(3, listOf("1", "2", "Fizz")),
            Arguments.of(5, listOf("1", "2", "Fizz", "4", "Buzz")),
            Arguments.of(15, listOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")),
        )
    }

    private lateinit var sut: FizzBuzz

    @BeforeEach
    fun setUp() {
        sut = FizzBuzz()
    }

    @ParameterizedTest(name = "{0} as input creates {1}")
    @MethodSource("fizzesAndBuzzes")
    fun `returns correct fizz buzz sequence`(input: Int, expected: List<String>) {
        val result = sut.fizzBuzz(input)

        assertContentEquals(expected, result)
    }
}
