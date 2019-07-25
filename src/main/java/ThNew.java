/*
   Just a colorful thread :)
   ColPick take
 */


import java.util.Random;

public class ThNew extends Thread {

    private String name = "standard";



    ThNew(String name){
        this.name = name;

    }

    @Override
    public void run(){
        try{
            sleep(new Random().nextInt(1000));
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(TxColor.colPick()+"Thread " + name + " started");
    }

}
