/* Qualtrics Krakow Tech Screen 3.2
3. Matrix Summation
Devon uses the below algorithm to convert "before matrix" to "after matrix". The challenge is to find the "before matrix" given "after".
Algorithm
s = 0;
for (i = 0; i 5 x; i += 1) for (j = 0; j 5 y; j += 1) s = s + before(i, j);
}
}
after(x, y) = s;
Example
Before
2 3 5 7
After
2 5 7 17
If array before = [12,31, [5,71], then after = 112,51 [7,17.1.1
The algorithm is run for each after(x, y) to determine their values. For example, in the above table, calculate after(1, 7). It is the sum of all values from before(0,0) through before(1,1) or 2 + 3 + 5 + 7 = 17. The value at after(0, 7) is the sum of all elements from before(0,0) through before(0,1) or 2 + 5 = 7. Given after, find the original values in before.
Function Description Complete the function findBeforeMatrix in the editor below. The function must return an n x m array of integers representing Devon's before matrix.
findBeforeMatrix has the following parameter(s): after: an n x m array of integers Constraints • / n,m<_ 103 • 0 after(i, j) 103, where 0 i < n and 0 < m
► Input Format for Custom Testing
V Sample Case 0
Sample Input 0
2 2 1 2 3 4
Sample Output 0
1 1
2 0
Explanation 0 The walkthrough below details how Devon used the algorithm above to create the after array.
Devon's original 2 x 2 matrix, before, contained the following values:
• before(0, 0) = 1 • before(0, 1) = 1 • before(1, 0) = 2 • before(1, 1) = 0
The algorithm is used to create the following 2 x 2 matrix, after
• after(0, 0) • after(0, 1) • after(1, 0) • after(1, 1)
= before(0, 0) = 1 = before(0, 0) + before(0, 1) = 1 + 1 = 2 = before(0, 0) + before(1, 0) = 1 + 2 = 3 = before(0, 0) + before(0, 1) + before(1, 0) + before(1, 1) = 1 + 1 + 2 + 0 = 4
• Sample Case 1
Sample Input 1
2 2 2 1 5 4
Sample Output 1
2 -1
3 0
Explanation 1 The walkthrough below details how Devon used the algorithm above to create the after array.
Devon's original 2 x 2 matrix, before, contained the following values:
• before(0, 0) = 2 • before(0, 1) = -7 • before(1, 0) = 3 • before(1, 1) = 0
The algorithm is used to create the following 2 x 2 matrix, after
• after(0, 0) = before(0, 0) = 2 • after(0, 1) = before(0, 0) + before(0, 1) = 2 + (-1) = 1 • after(1, 0) = before(0, 0) + before(1, 0) = 2 + 3 = 5
• after(1, 1) = before(0, 0) + before(0, 1) + before(1, 0) + before(1, 1) = 2 + (-1) + 3 + 0 = 4


 */

public class MatrixSummarizon {
}
