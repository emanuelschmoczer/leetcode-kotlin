package com.schmoczer.leetcode._1672

class RichestCustomerWealth {
    // Runtime 0ms Beats 100.00%
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var richest = 0
        for (customer in accounts) {
            var wealth = 0
            for (account in customer) {
                wealth += account
            }
            if (wealth > richest) {
                richest = wealth
            }
        }
        return richest
    }
}
