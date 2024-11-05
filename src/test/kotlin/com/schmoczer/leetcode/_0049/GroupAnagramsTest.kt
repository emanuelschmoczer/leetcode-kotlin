package com.schmoczer.leetcode._0049

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class GroupAnagramsTest {
    private lateinit var sut: GroupAnagrams

    @BeforeEach
    fun setUp() {
        sut = GroupAnagrams()
    }

    @Test
    fun `3 groups anagrams`() {
        val input = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")

        val result = sut.groupAnagrams(input)

        assertContains(result, listOf("bat"))
        assertContains(result, listOf("tan", "nat"))
        assertContains(result, listOf("eat", "tea", "ate"))
    }

    @Test
    fun `empty String is an anagram`() {
        val input = arrayOf("")
        val expected = listOf(listOf(""))

        val result = sut.groupAnagrams(input)

        assertEquals(expected, result)
    }

    @Test
    fun `string with length 1 is anagram`() {
        val input = arrayOf("a")
        val expected = listOf(listOf("a"))

        val result = sut.groupAnagrams(input)

        assertEquals(expected, result)
    }
}
