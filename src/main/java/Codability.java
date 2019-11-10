/*Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

        Given A = [1, 2, 3], the function should return 4.

        Given A = [−1, −3], the function should return 1.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].
*/


import java.util.*;
import java.util.stream.Collectors;

public class Codability {
    public static void main(String[] args) {

        int[] A = new int[]{1, 3, 6, 4, 1, 2, 5};

        //int[] A = ArrayGen.randpos(4000000);

        System.out.println(sol(A));
    }

    static int sol(int[] A){

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i<A.length; i++){
            set.add(A[i]);
        }

        //System.out.println(set);

        for(int i = 1; i<=Integer.MAX_VALUE; i++){
            if(!set.contains(i)){return i;}
        }

        return -999;
    }
}
