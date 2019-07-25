/*
   Just a thread
 */

import java.util.ArrayList;
import java.util.Random;

public class ThNew extends Thread {

    private String name = "standard";
    private TxColor tx;
    private Random r;
    private ArrayList<String> CList;

    ThNew(String name){
        name = this.name;
        tx = new TxColor();
        CList = tx.getCList();
        r = new Random(CList.size());
    }

    @Override
    public void run(){
        System.out.println("Thread " + name + " started");
    }

    // choose a random color thread
    private String colPick(){
        return CList.get(r.nextInt());
    }


}
