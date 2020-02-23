package threadplay;

public class ThSendMes extends Thread{
    SendMes sender;
    String message;

    ThSendMes(SendMes obj, String msg){
        sender = obj;
        message = msg;
    }

    @Override
    public void run(){
        synchronized (sender){
            sender.send(message);
        }
    }
}

