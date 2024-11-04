package com.schmoczer.leetcode._3163

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals

class StringCompression3Test {
    private lateinit var sut: StringCompression3

    @BeforeEach
    fun setUp() {
        sut = StringCompression3()
    }

    @Test
    fun `abcde is compressed to 1a1b1c1d1e`() {
        assertEquals("1a1b1c1d1e", sut.compressedString("abcde"))
    }

    @Test
    fun `aaaaaaaaaaaaaabb is compressed to 9a5a2b`() {
        assertEquals("9a5a2b", sut.compressedString("aaaaaaaaaaaaaabb"))
    }
}
