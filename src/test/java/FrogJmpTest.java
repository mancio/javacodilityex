import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayName;



import static org.junit.jupiter.api.Assertions.assertEquals;


public class FrogJmpTest {

    private SolutionJmp s;

    @BeforeEach
    public void setup() {
        s = new SolutionJmp();
    }



    public void SimpleTest(){
        assertEquals(142730189,s.solution(3,999111321,7));
    }


}