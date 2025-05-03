package com.schmoczer.leetcode._0049

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class GroupAnagramsTest {
    private companion object {
        @JvmStatic
        fun anagramInputs() = listOf(
            Arguments.of(
                arrayOf("eat", "tea", "tan", "ate", "nat", "bat"),
                listOf(
                    listOf("bat"),
                    listOf("tan", "nat"),
                    listOf("eat", "tea", "ate"),
                ),
            ),
            Arguments.of(
                arrayOf(""),
                listOf(listOf("")),
            ),
            Arguments.of(
                arrayOf("a"),
                listOf(listOf("a")),
            ),
        )
    }

    private lateinit var sut: GroupAnagrams

    @BeforeEach
    fun setUp() {
        sut = GroupAnagrams()
    }

    @ParameterizedTest(name = "group anagrams for input {0} is {1}")
    @MethodSource("anagramInputs")
    fun `returns the correct grouped anagrams`(input: Array<String>, expected: List<List<String>>) {
        val result = sut.groupAnagrams(input)

        assertEquals(expected.size, result.size)
        expected.forEach { group ->
            assertEquals(1, result.count { it.containsAll(group) && group.containsAll(it) })
        }
    }
}
