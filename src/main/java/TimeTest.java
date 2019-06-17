/*
    Used to calculate the execution time of a piece of code
 */
public class TimeTest {

    private long startTime;
    private long endTime;
    private String name = "test";

    public TimeTest(String name) {
        this.name = name;
    }

    public TimeTest() {
        this.name = name;
    }

    long start(){
        startTime = System.currentTimeMillis();
        return startTime;
    }

    long finish(){
        endTime = System.currentTimeMillis();
        return endTime;
    }

    long exec_time(){
        long tot = endTime - startTime;
        System.out.println("^^^^^^^^^^^^^^^^");
        System.out.println("Total execution time of " + name + " : " + tot + " Mills");
        System.out.println("^^^^^^^^^^^^^^^^");
        return tot;
    }

}
