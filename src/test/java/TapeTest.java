import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TapeTest {

    @Test
    public void test(){
        int[] A = {-1000,99,7,0,-10};
        int sol = 884;
        assertEquals(sol,TapeEquilibrium.solution(A));
    }


}
