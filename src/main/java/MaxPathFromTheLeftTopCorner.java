
/*
Codility Challenge:
Technetium 2019

MaxPathFromTheLeftTopCorner

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

public class MaxPathFromTheLeftTopCorner {

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

        int[][] Z = new int[][]{
                {2,2,2,2,2,2,2,2,2,2,2},
                {2,2,2,2,2,8,2,2,2,2,2},
                {2,2,2,2,2,2,2,2,2,2,2},
                {2,2,2,2,2,2,2,2,2,2,2},
        };

        System.out.println(sol(A));

    }

    static String sol(int[][] A) {

        String st = "";
        String first = "";
        String second = "";
        int n = A[0].length;
        int m = A.length;

        int h = 0;
        int v = 0;

        st = st.concat(String.valueOf(A[0][0]));

        while(h<n && v<m){

            if(h==n-1 && v==m-1){
                break;
            }

            if(h<n-1) {
                first = "";
                first = st.concat(String.valueOf(A[v][h + 1]));
            }
            if(v<m-1) {
                second = "";
                second = st.concat(String.valueOf(A[v + 1][h]));
            }

            if(Long.valueOf(first)>=Long.valueOf(second)){
                st = st.concat(String.valueOf(A[v][h+1]));
                h++;

            }else {
                st = st.concat(String.valueOf(A[v+1][h]));
                v++;

            }




        }




        return st;
    }
}
