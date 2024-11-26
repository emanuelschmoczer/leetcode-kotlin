package com.schmoczer.leetcode._2924

class FindChampionII {
    // Attempt 1 using a Set
    fun findChampion1(n: Int, edges: Array<IntArray>): Int {
        val possibleChampions = HashSet<Int>(n)
        for (i in 0 until n) {
            possibleChampions.add(i)
        }
        for (edge in edges) {
            possibleChampions.remove(edge[1])
        }

        return if (possibleChampions.count() == 1) possibleChampions.first() else -1
    }

    // Attempt 2: Runtime 2ms Beats 100.00%
    fun findChampion(n: Int, edges: Array<IntArray>): Int {
        val possibleChampions = Array<Int>(n) { 1 }

        for (edge in edges) {
            possibleChampions[edge[1]] = 0
        }
        val first = possibleChampions.indexOfFirst { it == 1 }
        val last = possibleChampions.indexOfLast { it == 1 }
        return if (first == last) first else -1
    }
}
