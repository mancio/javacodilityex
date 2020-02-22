/*
given an array of numbers output the second maximum number of
the array
*/


import java.util.ArrayList;

public class SecMax {

    public static void main(String[] args) {

        int [] a = {4,5,2,8,2,1,1,73,74,73,1};

        System.out.println(secMax(a));

    }

    static int secMax(int[] a){

        int fr,sec;
        fr = sec = Integer.MIN_VALUE;


        for (int value : a) {
            if (value > fr) {
                sec = fr;
                fr = value;
            }/*else if(a[i]>sec && a[i]!= fr){
                sec = a[i];
            }*/


        }


        return sec;
    }
}

/*
4,5,2

4>last ok; last = 4
4>seclast ok; seclast = 4
5>last ok; last =5
5>seclast no

*/