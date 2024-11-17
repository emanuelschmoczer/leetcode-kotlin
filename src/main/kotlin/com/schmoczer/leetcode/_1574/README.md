# Shortest Subarray to be Removed to Make Array Sorted

Given an integer array `arr`, remove a subarray (can be empty) from `arr` such that the remaining elements in `arr` are
non-decreasing.

Return the length of the shortest subarray to remove.

A subarray is a contiguous subsequence of the array.

Example 1:

> Input: arr = [1,2,3,10,4,2,3,5]
>
> Output: 3

Example 2:

> Input: arr = [5,4,3,2,1]
>
> Output: 4

Example 3:

> Input: arr = [1,2,3]
>
> Output: 0

Constraints:

- `1 <= arr.length <= 10^5`
- `0 <= arr[i] <= 10^9`
