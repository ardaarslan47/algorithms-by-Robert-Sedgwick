# Binary Search

This Java program implements binary search to determine whether a given real number exists in a sorted array of real numbers.

## Algorithm

0. ∀k ∈ R, ∀A where A is a sorted array of real numbers
1. 
    1.1. Initialize two integer 'lo' and 'hi'
    1.2. Set 0 to 'lo' and 'last index of array' to 'hi'
2. 
    2.1. If lo > hi return - 1 and end
    2.2. Initialize 'mid' and set arithmetic mean of 'lo' and 'hi' to it
3. 
    3.1. If k = A[mid] return found and end
    3.2. If k greater than A[mid] set 'mid + 1' to 'lo' (so in next iteration we can check arithmetic mean of 'mid' and 'hi')
    3.3. If k lesser than A[mid] set 'mid - 1' to 'hi' (so in next iteration we can check arithmetic mean of 'lo' and 'mid')
4. Return to step 2

## Usage

To use the program, follow these steps:

1. Download BinarySearch.class or clone repository

2. Run the program with the array of numbers as command-line arguments:

```
java BinarySearch <array of numbers separated by spaces>
```

3. While the program is running, enter a real number to check if it exists in the array.

4. To quit the program, enter a non-numeric value.