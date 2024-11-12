package com.schmoczer.leetcode._2070

class MostBeautifulItemForEachQuery {
    // Runtime 93ms Beats 100.00%
    fun maximumBeauty(items: Array<IntArray>, queries: IntArray): IntArray {
        val result = mutableListOf<Int>()
        val alreadyQueried = mutableMapOf<Int, Int>()

        items.sortBy { it[0] }
        val filteredItems = mutableListOf<IntArray>()
        var currentMax = 0
        for (i in 0 until items.size) {
            val item = items[i]
            if (currentMax < item[1]) {
                currentMax = item[1]
                filteredItems.add(item)
            }
        }

        for (query in queries) {
            if (alreadyQueried[query] != null) {
                result.add(alreadyQueried[query]!!)
            } else {
                var maximumBeauty = 0
                var j = 0
                while (j < filteredItems.size && filteredItems[j][0] <= query) {
                    if (filteredItems[j][1] > maximumBeauty) {
                        maximumBeauty = filteredItems[j][1]
                    }
                    j++
                }
                result.add(maximumBeauty)
                alreadyQueried[query] = maximumBeauty
            }
        }
        return result.toIntArray()
    }
}
