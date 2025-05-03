package com.schmoczer.leetcode._0876

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class MiddleOfTheLinkedListTest {
    private companion object {
        @JvmStatic
        fun linkedLists() = listOf(
            Arguments.of(intArrayOf(1, 2, 3, 4, 5), 3),
            Arguments.of(intArrayOf(1, 2, 3, 4, 5, 6), 4),
        )
    }

    private lateinit var sut: MiddleOfTheLinkedList

    @BeforeEach
    fun setUp() {
        sut = MiddleOfTheLinkedList()
    }

    @ParameterizedTest(name = "middle of {0} is {1}")
    @MethodSource("linkedLists")
    fun `returns the middle node of the linked list`(numbers: IntArray, expected: Int) {
        val input = createLinkedList(numbers)

        val result = sut.middleNode(input)

        assertEquals(expected, result?.`val`)
    }

    fun createLinkedList(numbers: IntArray): ListNode {
        var node = ListNode(numbers.last())
        for (i in (0..<(numbers.size - 1)).reversed()) {
            node = ListNode(numbers[i], node)
        }
        return node
    }
}
