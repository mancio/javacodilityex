package threadplay;/*
    Simple program to study concurrency
 */

public class ThRandy {

    public static void main(String[] args) {



        //Random r = new Random();

        ThNew th1 = new ThNew("Mario1");
        ThNew th2 = new ThNew("Giorgio2");
        ThNew th3 = new ThNew("Andrea3");

        try {
            th3.start();
            th3.join();
            th1.start();
            th1.join();
            th2.start();
            th2.join();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
