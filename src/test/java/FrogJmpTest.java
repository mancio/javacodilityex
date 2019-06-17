import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(value = Parameterized.class)
public class FrogJmpTest {



    private int sol;
    private int X;
    private int Y;
    private int D;

    public FrogJmpTest(int sol, int X, int Y, int D){
        this.sol = sol;
        this.X = X;
        this.Y = Y;
        this.D = D;
    }

    @Parameterized.Parameters(name = "{index}: Jump(X = {1}, Y = {2}, D = {3}) -> {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {142730189, 3, 999111321,7},
                {3,10,85,30}
                /*{8, 2, 10},
                {4, 5, 9},
                {5, 5, 10}*/
        });
    }




    @Test
    public void SimpleTest(){
        SolutionJmp s = new SolutionJmp();
        assertEquals(sol,s.solution(X, Y, D));

    }


}