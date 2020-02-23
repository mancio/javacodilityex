package threadplay;

public class Manager {
    public static void main(String[] args) {

        SendMes sm1 = new SendMes();
        SendMes sm2 = new SendMes();
        SendMes sm3 = new SendMes();
        ThSendMes tm = new ThSendMes(sm2, "hello");
        ThSendMes tm2 = new ThSendMes(sm2, "how are");
        ThSendMes tm3 = new ThSendMes(sm2, "you?");

        tm.start();
        tm2.start();

        try
        {
            tm.join();
            tm2.join();

        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }
        tm3.start();
    }
}
