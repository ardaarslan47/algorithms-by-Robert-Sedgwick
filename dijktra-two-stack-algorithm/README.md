# Dijkstra Two-Stack Algorithm

This Java program implements Dijkstra's Two-Stack Algorithm for evaluating arithmetic expressions. 

## Algorithm Steps

#### Step 0:
- For any given arithmetic expression, the algorithm finds result of expression.

#### Step 1: Initialize stacks
1. Initialize two stacks: one for operators (`ops`) and one for values (`vals`).

#### Step 2: Tokenize Arithmetic Expression
1. Initialize `tokens` as empty string array.
2. Push every character of arithmetic expression (except whitespaces and open paranthesis) to `tokens`.

#### Step 3: Evaluate Expression
1. If tokens don't have next element return first element of vals and end.
2. Get next element of `tokens` and set to `token`.
3. If the token is an operator (`+`, `-`, `*`, `/`, `sqrt`), push it onto the `ops` stack. Return to step 3.1.
4. If `token` is numeric push token to vals and go to step 3.1.
5. If `token` is equal to close paranthesis go to step 4.1.

#### Step 4: Perform Operations
1. Pop (set it's value to `v` and remove from vals) last element of `vals` and set to `v`.
2. Pop last element of `ops` and set to `op`.
3. If `op` is equal to '+' remove last element of vals and add it's value to v and push result to vals.
4. If `op` is equal to '-' remove last element of vals and substract it's value from v and push result to vals.
5. If `op` is equal to '*' remove last element of vals and multiply it's value with v and push result to vals.
6. If `op` is equal to '/' remove last element of vals and divide it's value from v and push result to vals.
7. If `op` is equal to 'sqrt' calculate square root of v and push the value to vals.
8. Return to step 3.1.

## Usage
To use program, follow these steps:

1. Download dijkstra.class or clone repository.

2. Run the program:
```
java dijkstra
```

3. While the program running, enter arithmetic expression to calculate.