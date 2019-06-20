/*

https://funnelgarden.com/missinginteger-codility-solution/

(I think my solution is smarter :) )

This is a demo task.

Write a function:

    class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].


 */

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MissingInteger {

    public static void main(String[] args) {

        int[] A = {1, 3, 6, 4, 1, 2};

        int sol = solution(A);

    }

    static int solution(int[] A){

        Set<Integer> s = new TreeSet<>();

        for (int el:A){
            s.add(el);
        }

        for(int i = 1; i<=1_000_000+1;i++){
            if(!s.contains(i)) return i;
        }

        return -1;
    }
}
