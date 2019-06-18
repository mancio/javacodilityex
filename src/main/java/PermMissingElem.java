/*


An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

    class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:
  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5

the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [0..100,000];
        the elements of A are all distinct;
        each element of array A is an integer within the range [1..(N + 1)].



1 + x + n + 1 = 11

x + n = 11 - 2

x + n = 9

x + 5 = 9

x = 9 - 5

x = 4

 */



public class PermMissingElem {


    public static void main(String[] args) {

        int[] A = {2, 3, 1, 5};


        int a = solution(A);

        System.out.println(a);

    }

    static int solution(int[] A) {

        int sum = 0;
        int max = 0;

        for (int el : A){
            sum+=el;
            if(el>max) max = el;

        }

        int tot = sum-2-max;

        return tot;
    }

}

