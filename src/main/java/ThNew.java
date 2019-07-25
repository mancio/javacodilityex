/*
   Just a colorful thread :)
   ColPick take
 */



public class ThNew extends Thread {

    private String name = "standard";

    private TxColor tc;

    ThNew(String name){
        name = this.name;
        tc = new TxColor();
    }

    @Override
    public void run(){
        System.out.println(tc.colPick()+"Thread " + name + " started");
    }




}
