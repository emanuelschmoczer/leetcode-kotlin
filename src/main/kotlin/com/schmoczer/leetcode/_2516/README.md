# Take K of Each Character From Left and Right

You are given a string `s` consisting of the characters `'a'`, `'b'`, and `'c'` and a non-negative integer `k`. Each
minute, you may take either the leftmost character of `s`, or the rightmost character of `s`.

Return the minimum number of minutes needed for you to take at least `k` of each character, or return `-1` if it is not
possible to take `k` of each character.

Example 1:

> Input: s = "aabaaaacaabc", k = 2
>
> Output: 8

Example 2:

> Input: s = "a", k = 1
>
> Output: -1

Constraints:

- 1 <= s.length <= 10^5`
- `s` consists of only the letters `'a'`, `'b'`, and `'c'`.
- `0 <= k <= s.length`