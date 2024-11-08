# Maximum XOR for Each Query

You are given a sorted array `nums` of `n` non-negative integers and an integer `maximumBit`. You want to perform the
following query `n` times:

1. Find a non-negative integer `k < 2^maximumBit` such that `nums[0] XOR nums[1] XOR ... XOR nums[nums.length-1] XOR k`
   is maximized. `k` is the answer to the query number `i`.
2. Remove the last element from the current array `nums`.

Return an array `answer`, where `answer[i]` is the answer to the `i`-th query.

Example 1:

> Input: nums = [0,1,1,3], maximumBit = 2
>
> Output: [0,3,2,3]

Example 2:

> Input: nums = [2,3,4,7], maximumBit = 3
>
> Output: [5,2,6,5]

Example 3:

> Input: nums = [0,1,2,2,5,7], maximumBit = 3
>
> Output: [4,3,6,4,6,7]

Constraints:

- `nums.length == n`
- `1 <= n <= 105`
- `1 <= maximumBit <= 20`
- `0 <= nums[i] < 2^maximumBit`
- `nums` is sorted in ascending order.
