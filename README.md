# Kadane's Algorithm

Kadane's Algorithm is an efficient method used to find the **maximum sum of a contiguous subarray** within a one-dimensional array of numbers.

## Idea

The algorithm works by keeping track of two values:

- **Current Sum (currSum)** → Sum of the current subarray.
- **Maximum Sum (maxSum)** → Maximum sum found so far.

At each step:
1. Add the current element to `currSum`.
2. Update `maxSum` if `currSum` is greater.
3. If `currSum` becomes negative, reset it to `0`.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Use Cases
- Stock market profit analysis
- Data analysis
- Dynamic programming problems
