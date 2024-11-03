package com.schmoczer.leetcode._0008

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals

class StringToIntegerTests {
    private lateinit var sut: StringToInteger

    @BeforeEach
    fun setUp() {
        sut = StringToInteger()
    }

    @Test
    fun `"42" as String is 42 as Int`() {
        assertEquals(42, sut.myAtoi("42"))
    }

    @Test
    fun `" -042" as String is -42 as Int`() {
        assertEquals(-42, sut.myAtoi(" -042"))
    }

    @Test
    fun `"1337c0d3" as String is 1337 as Int`() {
        assertEquals(1337, sut.myAtoi("1337c0d3"))
    }

    @Test
    fun `"0-1" as String is 0 as Int`() {
        assertEquals(0, sut.myAtoi("0-1"))
    }

    @Test
    fun `"words and 987" as String is 0 as Int`() {
        assertEquals(0, sut.myAtoi("words and 987"))
    }

    @Test
    fun `"-2147483648" as String is -2147483648`() {
        assertEquals(Int.MIN_VALUE, sut.myAtoi("-2147483648"))
    }

    @Test
    fun `"2147483647" as String is 2147483647`() {
        assertEquals(Int.MAX_VALUE, sut.myAtoi("2147483647"))
    }

    @Test
    fun `"-91283472332" as String is -2147483648 because it is lower than Int MIN_VALUE`() {
        assertEquals(Int.MIN_VALUE, sut.myAtoi("-91283472332"))
    }

    @Test
    fun `"-2147483649" as String is -2147483648 because it is lower than Int MIN_VALUE`() {
        assertEquals(Int.MIN_VALUE, sut.myAtoi("-2147483649"))
    }

    @Test
    fun `"2147483648" as String is 2147483647 because it is higher than Int MAX_VALUE`() {
        assertEquals(Int.MAX_VALUE, sut.myAtoi("2147483648"))
    }

    @Test
    fun `empty String is 0`() {
        assertEquals(0, sut.myAtoi(""))
    }

    @Test
    fun `multiple whitespaces are 0`() {
        assertEquals(0, sut.myAtoi("        "))
    }
}
