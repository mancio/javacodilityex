// https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class JumpingOnTheClouds {
    public static void main(String[] args) {

        int[] ar = {0,0,1,0,0,1,0};
        //4

        int[] ar2 = {0,0,0,1,0,0};
        //3

        int[] ar3 = {0,0,0,0,1,0,0,0,0,1,0};
        //3

        //0,1,3,4,6

        //2,5

        // 6-1 = 5

        System.out.println(jumpingOnClouds(ar2));
    }

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        int step = 0;
        int zeros = 1;

        for (int i = 1; i<c.length; i++){
            if(c[i]==1){
                zeros = 0;
            }else {
                step++;
                zeros++;
                if(zeros>=3){
                    step--;
                    zeros=1;
                }
            }
        }

        return step;

    }
}

// Passed! remember zero is reset to 1 because I 