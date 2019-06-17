/* Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the Smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
*/




/*
    solution
// you can also use imports, for example:
// import java.util.*;
import java.util.HashSet;

import java.util.Set;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        int sol = -1;

        Set<Integer> set = new HashSet<>();

        for(int el: A){
            if(el>0){
                set.add(el);
            }
        }

        for(int i = 1; i <= A.length + 1; i++){
            if(!set.contains(i)){
                return i;
            }
        }

        return sol;
    }
}
 */


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Smallest {



    public static void main(String[] args) {

        int[] A = {1, 3, 6, 4, 1, 2};

        System.out.println("A lungo: " + A.length);

        //int n = A.length;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int el: A){
            if(el>0){
                arr.add(el);
            }
        }

        Iterator<Integer> iter = arr.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        for(int i = 1; i <= A.length + 1; i++){
            if(!arr.contains(i)){
                System.out.println("number: " + i);
                return;
            }
        }




    }
}

