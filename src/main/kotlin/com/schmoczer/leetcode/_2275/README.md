# Largest Combination With Bitwise AND Greater Than Zero

The bitwise AND of an array `nums` is the bitwise AND of all integers in `nums`.

- For example, for `nums = [1, 5, 3]`, the bitwise AND is equal to `1 & 5 & 3 = 1`.
- Also, for `nums = [7]`, the bitwise AND is `7`.

You are given an array of positive integers `candidates`. Evaluate the bitwise AND of every combination of numbers of
`candidates`. Each number in `candidates` may only be used once in each combination.

Return the size of the largest combination of `candidates` with a bitwise AND greater than `0`.

Example 1:

> Input: candidates = [16,17,71,62,12,24,14]
>
> Output: 4

Example 2:

> Input: candidates = [8,8]
>
> Output: 2

Constraints:

- `1 <= candidates.length <= 10^5`
- `1 <= candidates[i] <= 10^7`
