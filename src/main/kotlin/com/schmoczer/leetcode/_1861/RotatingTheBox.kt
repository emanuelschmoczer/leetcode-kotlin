package com.schmoczer.leetcode._1861

class RotatingTheBox {
    fun rotateTheBox(box: Array<CharArray>): Array<CharArray> {
        if (box.isEmpty()) {
            return emptyArray()
        }
        for (row in box) {
            var lastStarFound: Int? = null
            var lastDotFound: Int? = null
            for (i in row.size - 1 downTo 0) {
                when (row[i]) {
                    '.' -> {
                        if (lastDotFound == null) {
                            lastDotFound = i
                        }
                    }

                    '*' -> {
                        lastStarFound = i
                        lastDotFound = null
                    }

                    '#' -> {
                        if (lastDotFound != null) {
                            row[lastDotFound] = '#'
                            row[i] = '.'
                            lastDotFound--
                        }
                    }
                }
            }
        }

        return Array(box[0].size) { x ->
            CharArray(box.size) { y ->
                box[box.size - y - 1][x]
            }
        }
    }
}
