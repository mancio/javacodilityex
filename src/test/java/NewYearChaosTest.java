import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class NewYearChaosTest {

    @ParameterizedTest
    @MethodSource("inOut")
    void chaos(int[] arr, String st) {
        assertEquals(NewYearChaos.chaos(arr),st);
    }

    static Stream<Arguments> inOut(){
        return Stream.of(
                arguments(new int[] {2,1,5,3,4}, "3"),
                                  // 1,2,3,4,5  1+1+2+1+1
                arguments(new int[]{5,1,2,3,7,8,6,4}, "Too chaotic"),
                                 // 1,2,3,4,5,6,7,8
                arguments(new int[] {1,2,5,3,7,8,6,4}, "7"),
                                 //  1,2,3,4,5,6,7,8        2+1+2+2+1
                arguments(new int[] {1,2,5,3,4,7,8,6}, "4")
                                 //  1,2,3,4,5,6,7,8
        );
    }
}