/*

A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

        For example, in array A such that:
        A[0] = 9  A[1] = 3  A[2] = 9
        A[3] = 3  A[4] = 9  A[5] = 7
        A[6] = 9

        the elements at indexes 0 and 2 have value 9,
        the elements at indexes 1 and 3 have value 3,
        the elements at indexes 4 and 6 have value 9,
        the element at index 5 has value 7 and is unpaired.

        Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

        For example, given array A such that:
        A[0] = 9  A[1] = 3  A[2] = 9
        A[3] = 3  A[4] = 9  A[5] = 7
        A[6] = 9

        the function should return 7, as explained in the example above.

        Write an efficient algorithm for the following assumptions:

        N is an odd integer within the range [1..1,000,000];
        each element of array A is an integer within the range [1..1,000,000,000];
        all but one of the values in A occur an even number of times.


*/

/*


Detected time complexity:
O(N**2)
expand all
Example tests
▶
example1
example test
✔
OK
expand all
Correctness tests
▶
simple1
simple test n=5
✔
OK
▶
simple2
simple test n=11
✔
OK
▶
extreme_single_item
[42]
✔
OK
▶
small1
small random test n=201
✔
OK
▶
small2
small random test n=601
✔
OK
expand all
Performance tests
▶
medium1
medium random test n=2,001
✔
OK
▶
medium2
medium random test n=100,003
✘
TIMEOUT ERROR
running time: 2.112 sec., time limit: 1.104 sec.
▶
big1
big random test n=999,999, multiple repetitions
✘
TIMEOUT ERROR
Killed. Hard limit reached: 14.000 sec.
▶
big2
big random test n=999,999
✘
TIMEOUT ERROR
Killed. Hard limit reached: 19.000 sec.


SCORE 66% BAD SOLUTION ON BIG ARRAYS
 */

import java.util.HashMap;
import java.util.Set;


public class OddOccurrencesInArray {

    public static void main(String[] args) {

        Solutionodd s = new Solutionodd();

        int[] A = ArrayGen.oneodd(1000000,4*100000000+1);

        //Printer.vlist(A);

        int sol = s.solution(A);

        System.out.println(sol);

    }
}


class Solutionodd {

    public int solution(int[] A){

        HashMap<Integer,Integer> h = new HashMap<>();

        for(int el :A){
            if(h.containsKey(el)){
                int occ = h.get(el);
                h.put(el, occ+1);
            }else{
                h.put(el, 1);
            }
        }

        Set<Integer> s = h.keySet();

        int sol = 0;

        for(int el: s){
            if(h.get(el) % 2 != 0) sol = el;
        }

        return sol;
    }
}
