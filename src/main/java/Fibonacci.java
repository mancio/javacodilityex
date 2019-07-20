/*
    fn = fn-1 + fn-2
    f0 = 1
    f1 = 1

    **
 * Java program to calculate and print Fibonacci number using both recursion
 * and Iteration.
 * Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
 * first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

*/

import java.util.ArrayList;
import java.util.LinkedList;

public class Fibonacci {


    public static void main(String[] args) {


        System.out.println(fibo(10));

    }



    static LinkedList<Integer> fibo(int num){

        LinkedList<Integer> ar = new LinkedList<>();



        for(int i = 0; i< num; i++){
            if(i==0 || i==1){
                ar.add(1);
            }else {
                ar.add(ar.get(i-1)+ ar.get(i-2));
            }
        }

        return ar;

    }

}
