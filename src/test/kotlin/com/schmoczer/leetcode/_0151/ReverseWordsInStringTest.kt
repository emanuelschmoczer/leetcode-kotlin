package com.schmoczer.leetcode._0151

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals

class ReverseWordsInStringTest {
    private lateinit var sut: ReverseWordsInString

    @BeforeEach
    fun setUp() {
        sut = ReverseWordsInString()
    }

    @Test
    fun `sentence with 4 words and without additional whitespace`() {
        assertEquals("blue is sky the", sut.reverseWords("the sky is blue"))
    }

    @Test
    fun `no leading or trailing whitespaces reversed String`() {
        assertEquals("world hello", sut.reverseWords("  hello world  "))
    }

    @Test
    fun `no additional whitespaces between words in reversed String`() {
        assertEquals("example good a", sut.reverseWords("a good   example"))
    }
}
