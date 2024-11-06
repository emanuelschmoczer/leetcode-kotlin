package com.schmoczer.leetcode._1957

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertEquals

class DeleteCharactersToMakeFancyStringTest {
    private lateinit var sut: DeleteCharactersToMakeFancyString

    @BeforeEach
    fun setUp() {
        sut = DeleteCharactersToMakeFancyString()
    }

    @Test
    fun `leeetcode made fancy is leetcode`() {
        assertEquals("leetcode", sut.makeFancyString("leeetcode"))
    }

    @Test
    fun `aaabaaaa made fancy is aabaa`() {
        assertEquals("aabaa", sut.makeFancyString("aaabaaaa"))
    }

    @Test
    fun `aab made fance is still aab`() {
        assertEquals("aab", sut.makeFancyString("aab"))
    }
}
