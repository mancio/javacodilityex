import org.junit.jupiter.api.Test;

import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;

class StreamsTest {

    @Test
    public void test1(){
        int[] inp = {9,3,0,1};
        ArrayList<Integer> ina = new ArrayList<>();
        for (int el : inp) {
            ina.add(el);
        }
        int[] inp2 = {9,3};
        ArrayList<Integer> ina2 = new ArrayList<>();
        for (int el : inp2) {
            ina2.add(el);
        }
        assertEquals(ina2, Streams.filter(ina));
    }


}