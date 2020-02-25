import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        int[] inp = {9,3,0,1};
        ArrayList<Integer> ina = new ArrayList<>();
        for (int el : inp) {
            ina.add(el);
        }

        System.out.println(filter(ina));

    }

    static List<Integer> filter(ArrayList ina){
        Stream<Integer> str = ina.stream();
        List<Integer> ls = str.filter(n -> n>2).collect(Collectors.toList());
        return ls;

    }



}
