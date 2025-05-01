package com.schmoczer.leetcode._0876

class MiddleOfTheLinkedList {
    // Approach: use a fast and a slow pointer. Runtime 0ms Beats 100.00%
    fun middleNode(head: ListNode?): ListNode? {
        var current = head?.next
        var middle = head
        while (current != null) {
            current = current.next?.next
            middle = middle?.next
        }
        return middle
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    constructor(`val`: Int, next: ListNode?) : this(`val`) {
        this.next = next
    }
}
