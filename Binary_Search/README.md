# Binary Search

This Java program implements binary search to determine whether a given real number exists in a sorted array of real numbers.

## Algorithm Steps

### Step 0: Initialization

- For any real number `k` and a sorted array `A`, the algorithm aims to find if `A` contains `k`.

### Step 1: Initialize Pointers

1.1. Initialize two integer variables `lo` and `hi`.
1.2. Set `lo` to `0` and `hi` to the index of the last element in the array.

### Step 2: Check Bounds

2.1. If `lo > hi`, the search space is empty. Return `-1` to indicate that `k` is not found and end the algorithm.
2.2. Initialize the variable `mid` and set it to the arithmetic mean of `lo` and `hi`.

### Step 3: Search and Update Pointers

3.1. If `k` is equal to `A[mid]`, return `mid` to indicate that `k` is found and end the algorithm.
3.2. If `k` is greater than `A[mid]`, update `lo` to `mid + 1` to narrow the search space to the upper half.
3.3. If `k` is lesser than `A[mid]`, update `hi` to `mid - 1` to narrow the search space to the lower half.

### Step 4: Repeat

- Repeat steps 2-3 until the search space is empty or the element is found.

## Usage

To use the program, follow these steps:

1. Download BinarySearch.class or clone repository

2. Run the program with the array of numbers as command-line arguments:

```
java BinarySearch <array of numbers separated by spaces>
```

3. While the program is running, enter a real number to check if it exists in the array.

4. To quit the program, enter a non-numeric value.
