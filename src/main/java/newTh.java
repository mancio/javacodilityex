public class newTh extends Thread {

    private String name = "standard";

    newTh(String name){
        name = this.name;
    }

    @Override
    public void run(){
        System.out.println("Thread " + name + " started");
    }
}
