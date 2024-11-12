package com.schmoczer.leetcode._0141

import org.junit.jupiter.api.BeforeEach
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class LinkedListCycleTest {
    private lateinit var sut: LinkedListCycle

    @BeforeEach
    fun setUp() {
        sut = LinkedListCycle()
    }

    @Test
    fun `tail connecting to 1st node is a cycle`() {
        val input = ListNode(3)
        input.next = ListNode(2)
        input.next?.next = ListNode(0)
        input.next?.next?.next = ListNode(4)
        input.next?.next?.next?.next = input.next

        assertTrue(sut.hasCycle(input))
    }

    @Test
    fun `tail connecting to head node is a cycle`() {
        val input = ListNode(1)
        input.next = ListNode(2)
        input.next?.next = input

        assertTrue(sut.hasCycle(input))
    }

    @Test
    fun `only one node with empty next is not a cycle`() {
        val input = ListNode(1)

        assertFalse(sut.hasCycle(input))
    }
}
