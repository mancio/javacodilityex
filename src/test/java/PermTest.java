import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class PermTest {




    @Test
    public void TestSimple(){

        int[] A = {1,2,3};
        int sol = 4;

        assertEquals(sol,PermMissingElem.solution(A));
    }

    @Test
    public void TestHard(){

        int res = PermMissingElem.solution(ArrayGen.onemis());
        //Printer.vlist(ArrayGen.onemis());
        int sol = 100_000;

        assertEquals(sol,res);
    }

}
