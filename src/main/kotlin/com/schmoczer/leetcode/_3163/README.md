# String Compression III

Given a string `word`, compress it using the following algorithm:

- Begin with an empty string `comp`. While `word` is not empty, use the following operation:
    - Remove a maximum length prefix of `word` made of a single character `c` repeating at most 9 times.
    - Append the length of the prefix followed by `c` to `comp`.

Return the string `comp`.

Example 1:

> Input: word = "abcde"
>
> Output: "1a1b1c1d1e"

Example 2:

> Input: word = "aaaaaaaaaaaaaabb"
>
> Output: "9a5a2b"

Constraints:

- `1 <= word.length <= 2 * 105`
- `word` consists only of lowercase English letters.
