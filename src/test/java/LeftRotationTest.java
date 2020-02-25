import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeftRotationTest {

    @Test
    void leftRot1() {
        // one left
        int[] in = {1,2,3,4,5};
        int rot = 1;
        int[] out = {2,3,4,5,1};
        assertEquals(LeftRotation.leftRot(in, rot),out);
    }
}