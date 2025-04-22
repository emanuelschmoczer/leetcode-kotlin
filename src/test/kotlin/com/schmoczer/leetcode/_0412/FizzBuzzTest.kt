package com.schmoczer.leetcode._0412

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertContentEquals

class FizzBuzzTest {
    private lateinit var sut: FizzBuzz

    @BeforeEach
    fun setUp() {
        sut = FizzBuzz()
    }

    @Test
    fun `fizz buzz for 3`() {
        val input = 3
        val expected = listOf("1", "2", "Fizz")

        val result = sut.fizzBuzz(input)

        assertContentEquals(expected, result)
    }

    @Test
    fun `fizz buzz for 5`() {
        val input = 5
        val expected = listOf("1", "2", "Fizz", "4", "Buzz")

        val result = sut.fizzBuzz(input)

        assertContentEquals(expected, result)
    }

    @Test
    fun `fizz buzz for 15`() {
        val input = 15
        val expected = listOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")

        val result = sut.fizzBuzz(input)

        assertContentEquals(expected, result)
    }
}
