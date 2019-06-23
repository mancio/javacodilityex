import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CountDivTest {

    @Test
    public void test1(){
        int A = 7;
        int B = 11;
        int K = 11;
        int sol = 1;
        assertEquals(sol,CountDiv.solution(A,B,K));
    }

    @Test
    public void test2(){
        int A = 0;
        int B = 2000000000;
        int K = 1;
        int sol = 2000000001;
        assertEquals(sol,CountDiv.solution(A,B,K));
    }

    @Test
    public void test3(){
        int A = 6;
        int B = 11;
        int K = 2;
        int sol = 3;
        assertEquals(sol,CountDiv.solution(A,B,K));
    }


}
