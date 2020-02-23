package threadplay;

import java.util.Random;

public class SendMes {

    public void send(String msg){
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(msg);
    }

}
