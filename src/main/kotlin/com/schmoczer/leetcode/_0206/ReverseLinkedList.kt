package com.schmoczer.leetcode._0206

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class ReverseLinkedList {
    // Attempt 1: Time O(n), Space O(1)
    fun reverseList1(head: ListNode?): ListNode? {
        var previous: ListNode? = null
        var current = head
        while (current != null) {
            val temp = current.next
            current.next = previous
            previous = current
            current = temp
        }
        return previous
    }

    // Attempt 2: non destructive
    fun reverseList2(head: ListNode?): ListNode? {
        if (head == null) {
            return null
        }
        var previous: ListNode? = null
        var current = head
        while (current != null) {
            val temp = ListNode(current.`val`)
            temp.next = previous
            previous = temp
            current = current.next
        }
        return previous
    }

    // Attempt 3: recursive, Time still O(n), but now also Space O(n)
    fun reverseList(head: ListNode?): ListNode? {
        if (head == null || head.next == null) {
            return head
        }
        val reversed = reverseList(head.next)
        head.next?.next = head
        head.next = null
        return reversed
    }
}
