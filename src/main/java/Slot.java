/*
    Write a function for a slot machine that give me the 10% winning ratio
    the slot machine output the numbers in an array of length 3
    every number picked is between 1 and 15 included
 */

import java.util.Arrays;
import java.util.Random;

public class Slot {
    public static void main(String[] args) {
        flippy();
    }


    static void flippy() {

        int[] num = new int[3];
        int min = 1;
        int max = 16;

        Random r = new Random();

        int magic_n = r.nextInt(max-min)+1;

        int count = 1;

        while (count<=20){
            int pick = r.nextInt(max-min)+1;
            if(count>=10 && pick == magic_n){
                for (int i = 0; i<num.length;i++){
                    num[i] = pick;
                    count = 1;
                }
            }else {
                for(int i = 0; i<num.length; i++){
                    num[i] = r.nextInt(max-min)+1;
                }
            }
            count++;
            System.out.println(Arrays.toString(num));
        }


    }
}

/*
    [1,2,3,4,5,6,7,8,9,10]

    10/10 = 1

    num /perc
    10/10 = 1
    20/10 = 2

 */