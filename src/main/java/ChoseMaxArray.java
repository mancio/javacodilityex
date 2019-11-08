import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ChoseMaxArray {

    public static void main(String[] args) {
        Random ran = new Random();

        int[] ar1 = new int[10];
        int[] ar2 = new int[10];

        for(int i=0; i<10; i++){
            ar1[i] = ran.nextInt(10);
            ar2[i] = ran.nextInt(10);
            System.out.println(ar1[i] + " " + ar2[i]);
        }

        System.out.println(sol(ar1,ar2));
    }

    static List sol(int[] ar1, int[] ar2){

        List<Integer> tot = IntStream.range(0, ar1.length).mapToObj(i->compare(ar1[i],ar2[i])).collect(Collectors.toList());
        return tot;
    }

    static int compare(int a, int b){
        if(a>=b){return a;}
        return b;
    }
}
