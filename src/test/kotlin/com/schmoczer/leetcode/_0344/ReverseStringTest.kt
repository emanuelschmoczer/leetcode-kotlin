package com.schmoczer.leetcode._0344

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertContentEquals

class ReverseStringTest {
    private lateinit var rs: ReverseString

    @BeforeEach
    fun setUp() {
        rs = ReverseString()
    }

    @Test
    fun `hello reversed is olleh`() {
        var s: CharArray = charArrayOf('h', 'e', 'l', 'l', 'o')

        rs.reverseString(s)

        assertContentEquals(charArrayOf('o', 'l', 'l', 'e', 'h'), s)
    }

    @Test
    fun `Hannah reversed is hannaH`() {
        var s = charArrayOf('H', 'a', 'n', 'n', 'a', 'h')

        rs.reverseString(s)

        assertContentEquals(charArrayOf('h', 'a', 'n', 'n', 'a', 'H'), s)
    }
}
