import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ChoseMaxArray {

    public static void main(String[] args) {
        Random ran = new Random();

        long[] ar1 = new long[5];
        long[] ar2 = new long[5];

        for(int i=0; i<ar1.length; i++){
            ar1[i] = ran.nextInt(5);
            ar2[i] = ran.nextInt(5);
            System.out.println(ar1[i] + " " + ar2[i]);
        }

        System.out.println(sol(ar1,ar2));

    }

    static Set<Long> sol(long[] ar1, long[] ar2){
        TreeSet<Long> hs = new TreeSet<>();
        for(int i = 0; i<ar1.length; i++){
            hs.add(ar1[i]);
            hs.add(ar2[i]);
        }
        return hs;
    }



    static long compare(long a, long b){
        if(a>=b){return a;}
        return b;
    }
}
