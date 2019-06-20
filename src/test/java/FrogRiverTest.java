import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FrogRiverTest {

    @Test
    /*For example, given X = 5 and array A such that:
    A[0] = 1
    A[1] = 3
    A[2] = 1
    A[3] = 4
    A[4] = 2
    A[5] = 3
    A[6] = 5
    A[7] = 4
    the function should return 6, as explained above.
    */
    public void test(){

        int sol = 6;
        int[] A = {1,3,1,4,2,3,5,4};
        int X = 5;

        assertEquals(sol,FrogRiverOne.solution(X,A));
    }

    @Test
    public void test2(){

        int sol = 0;
        int[] A = {1,31,1,1,1,1,6};
        int X = 1;

        assertEquals(sol,FrogRiverOne.solution(X,A));
    }

    @Test
    public void test3(){

        int sol = -1;
        int[] A = {3,6,9};
        int X = 1;

        assertEquals(sol,FrogRiverOne.solution(X,A));
    }

    @Test
    public void test4(){

        int sol = 4;
        int[] A = {1, 3, 1, 3, 2, 1, 3};
        int X = 3;

        /*
        1
        3
        2
         */

        assertEquals(sol,FrogRiverOne.solution(X,A));
    }

}
