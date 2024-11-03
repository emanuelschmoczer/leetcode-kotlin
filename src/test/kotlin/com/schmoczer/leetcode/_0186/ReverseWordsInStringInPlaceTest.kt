package com.schmoczer.leetcode._0186

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertContentEquals

class ReverseWordsInStringInPlaceTest {
    private lateinit var sut: ReverseWordsInStringInPlace

    @BeforeEach
    fun setUp() {
        sut = ReverseWordsInStringInPlace()
    }

    @Test
    fun `reverse 4 words sentence`() {
        var s = charArrayOf('t', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e')
        val expected = charArrayOf('b', 'l', 'u', 'e', ' ', 'i', 's', ' ', 's', 'k', 'y', ' ', 't', 'h', 'e')

        sut.reverseWords(s)

        assertContentEquals(expected, s)
    }

    @Test
    fun `reverse array with one entry`() {
        var s = charArrayOf('a')
        val expected = charArrayOf('a')

        sut.reverseWords(s)

        assertContentEquals(expected, s)
    }
}
