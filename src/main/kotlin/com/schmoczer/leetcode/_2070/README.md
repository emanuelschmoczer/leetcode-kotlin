# Most Beautiful Item for Each Query

You are given a 2D integer array `items` where `items[i] = [price-of-i, beauty-of-i]` denotes the price and beauty of an
item respectively.

You are also given a 0-indexed integer array `queries`. For each `queries[j]`, you want to determine the maximum beauty
of an item whose price is less than or equal to `queries[j]`. If no such item exists, then the answer to this query is
`0`.

Return an array `answer` of the same length as `queries` where `answer[j]` is the answer to the `j`'th query.

Example 1:

> Input: items = [[1,2],[3,2],[2,4],[5,6],[3,5]], queries = [1,2,3,4,5,6]
>
> Output: [2,4,5,5,6,6]

Example 2:

> Input: items = [[1,2],[1,2],[1,3],[1,4]], queries = [1]
>
> Output: [4]

Example 3:

> Input: items = [[10,1000]], queries = [5]
>
> Output: [0]

Constraints:

- `1 <= items.length, queries.length <= 10^5`
- `items[i].length == 2`
- `1 <= pricei, beautyi, queries[j] <= 10^9`
