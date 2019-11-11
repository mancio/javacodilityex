
/*
You are given a matrix A consisting of N rows and M columns, where each cell contains a digit. Your task is to find a continuous sequence of neighbouring cells, starting in the top-left corner and ending in the bottom-right corner (going only down and right), that creates the biggest possible integer by concatenation of digits on the path. By neighbouring cells we mean cells that have exactly one common side.

        Write a function:

class Solution { public String solution(int[][] A); }

that, given matrix A consisting of N rows and M columns, returns a string which represents the sequence of cells that we should pick to obtain the biggest possible integer.

        For example, given the following matrix A:

        [9 9 7] [9 7 2] [6 9 5] [9 1 2]

        the function should return "997952", because you can obtain such a sequence by choosing a path as shown below:

        [9 9 *] [* 7 *] [* 9 5] [* * 2]

        Write an efficient algorithm for the following assumptions:

        N and M are integers within the range [1..1,000];
        each element of matrix A is an integer within the range [1..9].

*/

import java.util.*;
import java.util.stream.Collectors;

public class Matrix {

    public static void main(String[] args) {

        int[][] A = new int[][]{
                {9,9,7},
                {9,7,2},
                {6,9,5},
                {9,1,2}
        };

        int[][] B = new int[][]{
                {3},
                {4},
                {8}
        };

        int[][] C = new int[][]{
                {3,9,0}

        };

        System.out.println(sol(A));

    }

    static String sol(int[][] A) {

        String st = "";

        int v = A.length - 1;
        int h = A[0].length - 1;
        if (h == 0) {
            for (int i = 0; i <= v; i++) {
                st = st.concat(String.valueOf(A[i][0]));
            }
        } else if (v == 0) {
            for (int i = 0; i <= h; i++) {
                st = st.concat(String.valueOf(A[0][i]));
            }

        } else {

            st = st.concat(String.valueOf(A[0][0]));

            int m = 0; //vertical
            int n = 0; // horizontal
            while(m<v && n<h) {
                if(A[m+1][n]>=A[m][n+1]){
                    st = st.concat(String.valueOf(A[m+1][n]));
                    m++;
                }else {
                    st = st.concat(String.valueOf(A[m][n+1]));
                    n++;
                }

            }

            st = st.concat(String.valueOf(A[v][h]));
        }


        return st;
    }
}
