/*

https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/



A small frog wants to get to the other side of a river. The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank (position X+1). Leaves fall from a tree onto the surface of the river.

You are given an array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.

The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves). You may assume that the speed of the current in the river is negligibly small, i.e. the leaves do not change their positions once they fall in the river.

For example, you are given integer X = 5 and array A such that:
  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4

In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.

Write a function:

    class Solution { public int solution(int X, int[] A); }

that, given a non-empty array A consisting of N integers and integer X, returns the earliest time when the frog can jump to the other side of the river.

If the frog is never able to jump to the other side of the river, the function should return −1.

For example, given X = 5 and array A such that:
  A[0] = 1
  A[1] = 3
  A[2] = 1
  A[3] = 4
  A[4] = 2
  A[5] = 3
  A[6] = 5
  A[7] = 4

the function should return 6, as explained above.

Write an efficient algorithm for the following assumptions:

        N and X are integers within the range [1..100,000];
        each element of array A is an integer within the range [1..X].

x = 5

1 0
3 1

4 3
2 4
5 6


1
3
4
2
5


 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static void main(String[] args) {

        int X = 0;
        int[] A = {};

        int sol = solution(X,A);

        System.out.println(sol);

    }

    static int solution(int X, int[] A){

        /*
            The first set is the step path required with the size of X
            The second contain all the different step found in the array
            With the for cycle I can keep track of the position on the array
         */

        Set<Integer> req = new HashSet<>();

        for (int i = 1; i<=X; i++){
            req.add(i);
        }

        Set<Integer> cur = new HashSet<>();

        for (int i = 0; i<A.length; i++){
            cur.add(A[i]);

            if(cur.size()<req.size()) continue;

            if(cur.containsAll(req)) return i;
        }

        return -1;
    }
}
