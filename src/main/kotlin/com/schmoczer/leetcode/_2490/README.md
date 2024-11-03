# Circular Sentence

A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

- For example, `"Hello World"`, `"HELLO"`, `"hello world hello world"` are all sentences.

Words consist of only uppercase and lowercase English letters. Uppercase and lowercase English letters are considered
different.

A sentence is circular if:

- The last character of a word is equal to the first character of the next word.
- The last character of the last word is equal to the first character of the first word.

For example, `"leetcode exercises sound delightful"`, `"eetcode"`, `"leetcode eats soul"` are all circular sentences.
However, `"Leetcode is cool"`, `"happy Leetcode"`, `"Leetcode"` and `"I like Leetcode"` are not circular sentences.

Given a string `sentence`, return `true` if it is circular. Otherwise, return `false`.

Example 1:

> Input: sentence = "leetcode exercises sound delightful"
> 
> Output: true

Example 2:

> Input: sentence = "eetcode"
> 
> Output: true

Example 3:

> Input: sentence = "Leetcode is cool"
> 
> Output: false

Constraints:

- `1 <= sentence.length <= 500`
- `sentence` consist of only lowercase and uppercase English letters and spaces.
- The words in `sentence` are separated by a single space.
- There are no leading or trailing spaces.
