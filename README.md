# Minimum Cost to Make Array Equal

This repository contains a Java solution to the problem of finding the minimum total cost to make all elements of an array equal.

## Problem Description

You are given two arrays `nums` and `cost`, each containing positive integers. The task is to find the minimum total cost such that all elements of the `nums` array become equal. You can perform the following operation any number of times:

- Increase or decrease any element of the `nums` array by 1.

The cost of performing one operation on the `i`-th element is given by `cost[i]`.

## Solution Overview

The solution sorts the elements of the `nums` array along with their corresponding costs in ascending order. It then calculates the prefix sum of the costs and initializes the total cost to 0.

Next, it iterates over the sorted array and calculates the total cost to make every element equal to the first element. It also keeps track of the minimum cost encountered so far.

Finally, it iterates from the second element to the last element and calculates the cost difference by considering the prefix sum of costs and suffix sum of costs. It updates the total cost and checks if it is the new minimum cost.

The algorithm returns the minimum cost as the result.

## Running the Code

To run the code, follow these steps:

1. Make sure you have Java installed on your system.
2. Clone this repository to your local machine.
3. Open a terminal and navigate to the cloned directory.
4. Compile the Java file by running the following command:

```
    javac Solution.java
```

5. Run the compiled program with the following command:
```
java Solution
```

6. Follow the prompts to input the number of elements and the values for the `nums` and `cost` arrays.
7. The program will calculate and display the minimum cost.

Feel free to modify the code or provide your own input arrays to observe different results.

## Example

Here's an example run of the program:

```
Enter the number of elements: 5
Enter the elements of nums array:
2 7 3 1 5
Enter the elements of cost array:
5 6 8 3 4

nums: [2, 7, 3, 1, 5]
cost: [5, 6, 8, 3, 4]
Minimum cost: 23
```


In this example, the input arrays are `nums = [2, 7, 3, 1, 5]` and `cost = [5, 6, 8, 3, 4]`. The program calculates the minimum cost to make all elements equal and displays the result as `Minimum cost: 23`.

---

This solution provides an efficient approach to solve the problem of finding the minimum cost to make all elements of an array equal. The code can be used as a reference or integrated into other projects for similar scenarios.

If you have any questions or suggestions, feel free to open an issue or pull request. Contributions are welcome!

