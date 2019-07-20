/*
/**
  Java Program to check if a number is Prime or Not. This program accepts a
  number from command prompt and check if it is prime or not.

  a number is called a prime number if its only divisible by 1 or itself






 */


public class Prime {

    public static void main(String[] args) {

        System.out.println(prime(9968));

    }

    static boolean prime(int num){

        if(num == 0 || num == 1){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;

    }
}
