/*
https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/
https://funnelgarden.com/countdiv-codility-solution/



Write a function:

    class Solution { public int solution(int A, int B, int K); }

that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

    { i : A ≤ i ≤ B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

Write an efficient algorithm for the following assumptions:

        A and B are integers within the range [0..2,000,000,000];
        K is an integer within the range [1..2,000,000,000];
        A ≤ B.


7 9 k=4


5 6 7 8 k=7
    x

2 3 4 5 6 k=3
  x     x



 */



public class CountDiv {

    public static void main(String[] args) {

        int A = 6;
        int B = 11;
        int K = 2;

        int sol = solution(A,B,K);

        System.out.println(sol);

    }

    static int solution(int A, int B, int K){

        int divisors = 0;



        //nothing to do when K > B

        if(K > B) {

            if(A == 0 || B == 0) {

                return 1; //K mod 0 == 0 so count a single divisor

            }

            return 0; //no divisors when A, B both != 0

        }



        if(A == 0) {

            divisors++;  //K mod 0 == 0

        }



        int updatedA = A;

        if(K > A) {

            updatedA = K; //skip checking all values < K

        }



        int firstNonZeroDivisor = 0;

        int lastNonZeroDivisor = 0;



        for(int i=updatedA; i<=B; i++) { if(i % K == 0) { firstNonZeroDivisor = i; break; } } for(int i=B; i>=updatedA; i--) {

            if(i % K == 0) {

                lastNonZeroDivisor = i;

                break;

            }

        }

        if(firstNonZeroDivisor == 0 && lastNonZeroDivisor == 0) {

            divisors = 0;

        }

        else {

            divisors += ((lastNonZeroDivisor - firstNonZeroDivisor) / K) + 1;

        }



        return divisors;
    }
}
