# N-Queens Problem - Pseudocode & Complexity Analysis

## Problem Statement
Place N chess queens on an N×N chessboard such that no two queens threaten each other. This means no two queens can share the same row, column, or diagonal.

---

## Pseudocode

### Main Algorithm
```
FUNCTION nQueens(board, row):
    // Base Case: All queens are successfully placed
    IF row == N:
        RETURN 1  // Found one valid solution
    
    count = 0
    
    // Try placing queen in each column of current row
    FOR col FROM 0 TO N-1:
        IF isSafe(board, row, col):
            board[row][col] = TRUE  // Place the queen
            
            // Recursively place queens in remaining rows
            count = count + nQueens(board, row + 1)
            
            board[row][col] = FALSE  // Backtrack: Remove the queen
    
    RETURN count
```

### Safety Check Function
```
FUNCTION isSafe(board, row, col):
    // Check 1: Verify no queen exists in the same column above
    FOR i FROM 0 TO row-1:
        IF board[i][col] == TRUE:
            RETURN FALSE
    
    // Check 2: Verify left diagonal (going up-left)
    i = row
    j = col
    WHILE i >= 0 AND j >= 0:
        IF board[i][j] == TRUE:
            RETURN FALSE
        i = i - 1
        j = j - 1
    
    // Check 3: Verify right diagonal (going up-right)
    i = row
    j = col
    WHILE i >= 0 AND j < N:
        IF board[i][j] == TRUE:
            RETURN FALSE
        i = i - 1
        j = j + 1
    
    RETURN TRUE  // Safe to place queen
```

### Driver Code
```
FUNCTION main():
    N = 4  // Board size (can be any positive integer)
    board = CREATE 2D boolean array of size N×N
    INITIALIZE all cells to FALSE
    
    totalSolutions = nQueens(board, 0)
    PRINT "Total solutions:", totalSolutions
```

---

## Complexity Analysis

### Time Complexity: **O(N!)**

**Detailed Breakdown:**

1. **First Row**: We have N choices to place the first queen
2. **Second Row**: In the worst case, we might try all N positions, but typically fewer are valid
3. **Subsequent Rows**: The number of valid positions decreases as we go deeper

**Mathematical Analysis:**
- Row 0: N choices
- Row 1: ≤ N choices (some positions blocked by first queen)
- Row 2: ≤ N choices (some positions blocked by previous queens)
- ...
- Row N-1: ≤ N choices

The recursion tree has:
- **Depth**: N (one level for each row)
- **Branching Factor**: ≤ N at each level

In the worst case, we explore approximately **N × N × N × ... (N times) = N^N** paths, but due to pruning from the isSafe() checks, the actual complexity is closer to **O(N!)**.

**Why N! and not N^N?**
- At each level, we eliminate many invalid positions
- The effective branching factor decreases as we go deeper
- For row k, we have at most (N - k) valid positions in many cases
- This leads to: N × (N-1) × (N-2) × ... × 1 ≈ **N!**

### Space Complexity: **O(N²)**

**Components:**

1. **Board Storage**: O(N²)
   - We use an N×N boolean array to represent the chessboard

2. **Recursion Call Stack**: O(N)
   - Maximum depth of recursion is N (one call for each row)
   - Each recursive call stores local variables

**Total Space Complexity**: O(N²) + O(N) = **O(N²)**

---

## Optimizations & Variations

### 1. **Using Arrays Instead of 2D Board**
Instead of a 2D board, we can use:
- `cols[N]`: Track which columns have queens
- `leftDiag[2N-1]`: Track left diagonals
- `rightDiag[2N-1]`: Track right diagonals

This improves:
- **isSafe() from O(N) to O(1)**: Direct lookup instead of loops
- **Overall time complexity remains O(N!)** but with better constant factors

### 2. **Bitmasking Approach**
Use bit manipulation to track available positions:
- Faster operations
- More memory efficient
- Same asymptotic complexity

### 3. **Symmetry Reduction**
For counting solutions:
- Only solve for half the first row positions
- Multiply result by 2 (exploiting symmetry)
- Reduces practical runtime by ~50%

---

## Example Walkthrough (N = 4)

```
Initial Board (4×4):
. . . .
. . . .
. . . .
. . . .

Step 1: Place queen at (0,0)
Q . . .
. . . .
. . . .
. . . .

Step 2: Try (1,0) - NOT SAFE (same column)
Step 3: Try (1,1) - NOT SAFE (diagonal)
Step 4: Try (1,2) - SAFE

Q . . .
. . Q .
. . . .
. . . .

... (continue backtracking)

Final Valid Solution:
. Q . .
. . . Q
Q . . .
. . Q .
```

For N=4, there are **2 distinct solutions**.

---

## Key Insights

1. **Backtracking is Essential**: We explore all possibilities and backtrack when we hit a dead end
2. **Pruning Matters**: The isSafe() function prunes invalid branches early
3. **Exponential Growth**: Solutions grow exponentially with board size:
   - N=1: 1 solution
   - N=4: 2 solutions
   - N=8: 92 solutions
   - N=10: 724 solutions
   - N=12: 14,200 solutions

4. **No Polynomial Solution Known**: This is an NP-hard problem; no polynomial-time solution exists

---

## Related Problems
- **N-Queens II**: Print all solutions instead of counting
- **Knight's Tour**: Similar backtracking approach
- **Sudoku Solver**: Another classic backtracking problem
- **Graph Coloring**: Constraint satisfaction with backtracking
