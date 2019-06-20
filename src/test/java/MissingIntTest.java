import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MissingIntTest {

    @Test
    public void test1(){

        int[] A = {1, 3, 6, 4, 1, 2};
        int sol = 5;

        assertEquals(sol, MissingInteger.solution(A));
    }

    @Test
    public void test2(){

        int[] A = {1, 2, 3};
        int sol = 4;

        assertEquals(sol, MissingInteger.solution(A));
    }

    @Test
    public void test3(){

        int[] A = {-1, -3};
        int sol = 1;

        assertEquals(sol, MissingInteger.solution(A));
    }

    @Test
    public void test4(){

        int[] A = {-1_000_000, 1_000_000};
        int sol = 1;

        assertEquals(sol, MissingInteger.solution(A));
    }
}
