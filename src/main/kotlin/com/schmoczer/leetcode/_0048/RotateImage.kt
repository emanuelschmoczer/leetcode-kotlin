package com.schmoczer.leetcode._0048

class RotateImage {
    // Runtime 0ms Beats 100.00%
    fun rotate(matrix: Array<IntArray>) {
        var i = 0
        while (i < matrix.size - 1 - i) {
            val width = matrix.size - i - 1
            for (j in i until width) {
                val up = matrix[i][j]
                val right = matrix[j][width]
                val down = matrix[width][matrix.size - 1 - j]
                val left = matrix[matrix.size - 1 - j][i]
                matrix[j][width] = up
                matrix[width][matrix.size - 1 - j] = right
                matrix[matrix.size - 1 - j][i] = down
                matrix[i][j] = left
            }
            i++
        }
    }
}

// width = 4 - 0 = 4
// i = 0, j = 0, right should be: (0, 3)
// first: j = 0, second: width - 1 = 3?
// down should be: (3, 3)
// row: width - 1 = 3, column: width - 1 - j = 3
// left should be: (3, 0)
//
// i = 0, j = 1, right should be: (1, 3)
// first: j = 1, second: widht - 1 = 3
// down should be (3, 2)
// row: width - 1, column: width - 1 - j = 2
// left should be (2, 0)
//
// i = 0, j = 2, right should (2, 3)
//
// width = 4 - 1 = 3
// i = 1, j = 1, right should be (1, 2)
// row: j = 1, column: width - 1 = 2
// down should be (2, 2)
// row: width - 1 = 2, column: width - 1 - j =
// left should be (2, 1)
