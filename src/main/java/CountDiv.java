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


 */



public class CountDiv {

    public static void main(String[] args) {

        int A = 6;
        int B = 12;
        int K = 6;

        int sol = solution(A,B,K);

        System.out.println(sol);

    }

    static int solution(int A, int B, int K){

        double f = (double) A;
        double l = (double) B;
        double div = (double) K;

        double sol;

        if(K==1){ return B;}
        else if(A==B){
            if(A%B==0) return 1;
            else sol = 0;
        }else {

            double calc = (l-f+1)/div;

            sol = Math.ceil(calc);
        }

        return(int) sol;
    }
}
