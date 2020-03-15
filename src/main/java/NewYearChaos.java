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
            if(ar[i]-(i+1)>2) return "Too chaotic";
            for(int j = Math.max(0,ar[i]-2);j<i; j++){
                if(ar[j]>ar[i]) ds++;
            }
        }
        return Integer.toString(ds);
    }
}

/*
Note:
- ar[i]-(i+1)>2 instead to abs value because is the element more
on the left to be checked because swap is from right to left and is normal
that after man swap small values are on the right
- the inner for check the number of position jumped from where the object is and where
 should be
 */
