// https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class CountingValleys {
    public static void main(String[] args) {

        int n = 8;
        String s = "UDDDUDDU";

        System.out.println(countingValleys(n,s));

    }

    static int countingValleys(int n, String s) {

        int up = 0;
        int down = 0;

        int valley = 0;

        char old = 'r';

        for (int i = 0; i<n; i++){
            char nw = s.charAt(i);
            if(nw=='D'&& nw==old){
                down++;
            }else if(nw=='U'){
                up++;
                if(up>1){

                }
            }

            old = nw;
        }


        return 7;

    }


}

/*

0 1
1 3
2 1
3 2
1 1

 */