// https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class CountingValleys {
    public static void main(String[] args) {

        int n = 12;
        String s = "DDUUDDUDUUUD";

        //   U D  D  D  U  D  D  U
        //  +1;0;-1;-2;-1;-2;-3;-2
        //  1 valley

        //   D  D  U  U  D  D  U  D  U  U  U  D
        //  -1;-2;-1; 0;-1;-2;-1;-2;-1; 0;+1; 0
        //  2 valleys
        System.out.println(countingValleys(n,s));

    }

    static int countingValleys(int n, String s) {

        int see_level = 0;
        int valleys = 0;
        boolean up = true;

        for(int i = 0; i<n; i++){
            if (s.charAt(i) == 'U') {
                see_level++;
                if(see_level==0){
                    up = true;
                }
            }else{
                see_level--;
                if(see_level==-1 && up){
                    valleys++;
                    up=false;
                }
            }
        }

        return valleys;

    }


}

// PASS!!! :) Be careful one valley is just one step under see level (-1) not two (-2)