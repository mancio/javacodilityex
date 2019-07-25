/*
    Simple program to study concurrency
 */

import java.util.Random;

public class ThRandy {

    public static void main(String[] args) {

        Random r = new Random();

        ThNew th1 = new ThNew("Mario");
        ThNew th2 = new ThNew("Giorgio");
        ThNew th3 = new ThNew("Andrea");
        th1.start();




        th2.start();
        th3.start();

    }



}
