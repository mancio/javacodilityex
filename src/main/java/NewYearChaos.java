// https://www.hackerrank.com/challenges/new-year-chaos/

import java.util.ArrayList;
import java.util.List;

public class NewYearChaos {
    public static void main(String[] args) {
        //1,2,3,4,5
        int[] q = {2,1,5,3,4};
        System.out.println(chaos(q));
    }

    static String chaos(int[] ar){
        int ds = 0;
        for(int i=ar.length-1;i>=0;i--){
            int sum = Math.abs(ar[i]-(i+1));
            if(sum>2){
                return "Too chaotic";
            }
            ds = (ds>=sum) ? ds : sum;
        }
        return Integer.toString(ds+1);
    }
}

// TO FINISH CALCULATE THE NUMBER OF SWAP
