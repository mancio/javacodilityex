public class LambClass {

    public static void main(String[] args) {
        LambInt increment = (int n)-> System.out.println(n+1);

        increment.sum(4);
    }
}
