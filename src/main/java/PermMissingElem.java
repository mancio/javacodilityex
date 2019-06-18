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

[52,53,54,56]

sum = 215

ris = 55

n + 1 + n - 1 + n - 2 + n - 3 = sum

4n - 5 = sum

4n = sum - 5

n = (sum - 5)/4

n = (215 - 5)/4

[2,3,5]

n + 1 + n - 1 + n - 2 = sum

3n - 2 = sum


[2,3,4,5,6,7,9]

n+1 = 9

n = 9 - 1 = 8

 */



public class PermMissingElem {


    public static void main(String[] args) {

        int[] A = {2, 3, 1, 5};


        int a = solution(A);

        System.out.println(a);

    }

    static int solution(int[] A) {

        int max = 0;

        for (int el : A){
            if(el>max) max = el;

        }

        int tot = max-1;

        return tot;
    }

    //wrong!!!! should be a number n-2 missing not only n-1

}

