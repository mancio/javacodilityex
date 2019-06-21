import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PermCheckTest {

    @Test
    public void test1(){

        int sol = 0;
        int[] A = {4,1,3,2,6};

        assertEquals(sol,PermCheck.solution(A));
    }

    @Test
    public void test2(){

        int sol = 1;
        int[] A = {4,1,3,2};

        assertEquals(sol,PermCheck.solution(A));
    }

    @Test
    public void test3(){

        int sol = 0;
        int[] A = {4,1,3};

        assertEquals(sol,PermCheck.solution(A));
    }

    @Test
    public void test4(){

        int sol = 0;
        int[] A = {4,1,3};

        assertEquals(sol,PermCheck.solution(A));
    }
}
