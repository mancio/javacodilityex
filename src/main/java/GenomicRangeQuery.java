/*
https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/



A DNA sequence can be represented as a string consisting of the letters A, C, G and T, which correspond to the types of successive nucleotides in the sequence. Each nucleotide has an impact factor, which is an integer. Nucleotides of types A, C, G and T have impact factors of 1, 2, 3 and 4, respectively. You are going to answer several queries of the form: What is the minimal impact factor of nucleotides contained in a particular part of the given DNA sequence?

The DNA sequence is given as a non-empty string S = S[0]S[1]...S[N-1] consisting of N characters. There are M queries, which are given in non-empty arrays P and Q, each consisting of M integers. The K-th query (0 ≤ K < M) requires you to find the minimal impact factor of nucleotides contained in the DNA sequence between positions P[K] and Q[K] (inclusive).

For example, consider string S = CAGCCTA and arrays P, Q such that:
    P[0] = 2    Q[0] = 4
    P[1] = 5    Q[1] = 5
    P[2] = 0    Q[2] = 6

The answers to these M = 3 queries are as follows:

        The part of the DNA between positions 2 and 4 contains nucleotides G and C (twice), whose impact factors are 3 and 2 respectively, so the answer is 2.
        The part between positions 5 and 5 contains a single nucleotide T, whose impact factor is 4, so the answer is 4.
        The part between positions 0 and 6 (the whole string) contains all nucleotides, in particular nucleotide A whose impact factor is 1, so the answer is 1.

Write a function:

    class Solution { public int[] solution(String S, int[] P, int[] Q); }

that, given a non-empty string S consisting of N characters and two non-empty arrays P and Q consisting of M integers, returns an array consisting of M integers specifying the consecutive answers to all queries.

Result array should be returned as an array of integers.

For example, given the string S = CAGCCTA and arrays P, Q such that:
    P[0] = 2    Q[0] = 4
    P[1] = 5    Q[1] = 5
    P[2] = 0    Q[2] = 6

the function should return the values [2, 4, 1], as explained above.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [1..100,000];
        M is an integer within the range [1..50,000];
        each element of arrays P, Q is an integer within the range [0..N − 1];
        P[K] ≤ Q[K], where 0 ≤ K < M;
        string S consists only of upper-case English letters A, C, G, T.



C 3
A 2
G 1
T 1

C A G C C T A
0 1 2 3 4 5 6

C A G C T A
0 1 2 3 5 6

0
1
2
3
4
5
6


*/

import java.util.HashMap;

public class GenomicRangeQuery {

    public static void main(String[] args) {

        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};

        int[] sol = solution(S, P, Q);

        Printer.vlist(sol);

    }

    static int[] solution(String S, int[] P, int[] Q) {

        int [] answers = new int[P.length];
        int stringLength = S.length();

        int [][] occurrences = new int [stringLength][4];

        //step 1 - for each row, count occurrences of each nucleotide (can only have 1 occurrence / row)
        //e.g. if S=CAGCCTA array will be
        //{
        //  {0,1,0,0}  C
        //  {1,0,0,0}  A
        //  {0,0,1,0}  G
        //  {0,1,0,0}  C
        //  {0,1,0,0}  C
        //  {0,0,0,1}  T
        //  {1,0,0,0}  A
        // }
        for(int i=0; i<occurrences.length; i++) {
            char c = S.charAt(i);
            if(c == 'A')      occurrences[i][0] = 1;
            else if(c == 'C') occurrences[i][1] = 1;
            else if(c == 'G') occurrences[i][2] = 1;
            else if(c == 'T') occurrences[i][3] = 1;
        }

        //step 2 - for each row (starting from 2nd row), add up occurrences of each nucleotide by adding
        //occurrences from previous row to current row
        //now have running sum of each nucleotide for any row
        //e.g. if S=CAGCCTA array will be
        //{
        //  {0,1,0,0}  C
        //  {1,1,0,0}  A
        //  {1,1,1,0}  G
        //  {1,2,1,0}  C
        //  {1,3,1,0}  C
        //  {1,3,1,1}  T
        //  {2,3,1,1}  A
        // }
        for(int i=1; i<stringLength; i++) {
            for(int j=0; j<4; j++) {
                occurrences[i][j] += occurrences[i-1][j];
            }
        }

        //check each slice for min by simple subtraction
        for(int i=0; i<P.length; i++) {
            int index1 = P[i];
            int index2 = Q[i];

            for(int j=0; j<4; j++) {
                int lowerIndexCount = 0;
                //when index1 not at beginning of String - need to get occurrences from just before
                // beginning of slice - to see if that nucleotide occurred within slice
                // e.g. if slice is (2, 4), need to check for occurrences of A, C, G, T from index 1 to 4
                if(index1-1 >= 0) {
                    lowerIndexCount = occurrences[index1-1][j];
                }

                if(occurrences[index2][j] - lowerIndexCount > 0) {
                    answers[i] = j+1; //nucleotide value is 1 more than loop value (A=1, C=2, G=3, T=4)
                    //no need to keep checking since always checking from smallest impact factor
                    //as soon as find occurrence, that has to be minimum, cause subsequent nucleotides have
                    //larger impact factor
                    break;
                }
        }
    }
    return answers;

    }
}


