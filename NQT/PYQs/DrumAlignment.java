package NQT.PYQs;

import java.io.*;
import java.util.*;
/*
 * Question Explanation
Let me break down this problem step by step:
Setup:
Students: N students in a class, each with a unique jersey number from 1 to N
Board: Each student has a board with their jersey number on it, placed in 
order from left to right (1, 2, 3, ..., N)
Game Rule: After every beat of a drum,
 the student at position where their board points will move to that location.

Understanding the Problem:
Initial state:

Student 1 stands at position 1 (board shows 1)
Student 2 stands at position 2 (board shows 2)
Student 3 stands at position 3 (board shows 3)
And so on...

Each drum beat: A student moves to the position indicated on
 the board at their current location.

Example Walkthrough (N=3, Jersey numbers: 1,2,3):
Initial Board arrangement: [2, 3, 1, 4]
(Board at position 1 shows 2, board at position 2 shows 3, etc.)
Initial Standing Order: Students 1, 2, 3, 4 at positions 1, 2, 3, 4
After 1st beat of drum:

Student at position 1 (Jersey #1) looks at board showing 2 → moves to position 2
Student at position 2 (Jersey #2) looks at board showing 3 → moves to position 3
Student at position 3 (Jersey #3) looks at board showing 1 → moves to position 1
Student at position 4 (Jersey #4) looks at board showing 4 → stays at position 4

New order: [3, 1, 2, 4]

The Question:
Find: After K drum beats, how many students are back at their original position?
The answer involves tracking cycles in the permutation created by the board arrangement.
 */
public class DrumAlignment {
    public static void main(String[] args) throws IOException {
        
    }
}
