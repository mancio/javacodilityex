import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MinSwapTwoTest {

    @ParameterizedTest
    @MethodSource("inOut")
    void minimumSwaps(int[] arr, int i) {

        assertEquals(MinSwapTwo.minimumSwaps(arr), i);

    }

    static Stream<Arguments> inOut(){
        return Stream.of(
                arguments(new int[]{4,3,1,2}, 3),
                                  //1,2,3,4
                                  //3,1,2,2
                arguments(new int[]{2,3,4,1,5},3),
                                  //1,2,3,4,5
                                  //1,1,1,3,0
                arguments(new int[]{1,3,5,2,4,6,7},3),
                                  //1,2,3,4,5,6,7
                                  //0,1,2,2,1,0,0
                arguments(new int[]{
                        2,31,1,38,29,5,44,6,12,
                        18,39,9,48,49,13,11,7,27,
                        14,33,50,21,46,23,15,26,8,
                        47,40,3,32,22,34,42,16,41,
                        24,10,4,28,36,30,37,35,20,
                        17,45,43,25,19}, 46)
        );
    }
}