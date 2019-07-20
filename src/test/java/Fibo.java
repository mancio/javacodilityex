import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Fibo {

    @Test
    public void test10(){
        LinkedList<Integer> t = new LinkedList<>();
        t.addAll(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55));

        assertEquals(Fibonacci.fibo(10),t);

    }

    @Test
    public void test12(){
        LinkedList<Integer> t = new LinkedList<>();
        t.addAll(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144));

        assertEquals(Fibonacci.fibo(12),t);

    }

}
