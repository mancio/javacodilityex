import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

// to print arrays and list on terminal

public class Printer {

    static void vlist(LinkedHashSet ar){

        Iterator<Integer> it = ar.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("--------------------");
    }

    static void vlist(ArrayList ar){

        Iterator<Integer> it = ar.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("--------------------");
    }

    static void vlist(int[] ar){
        for(int el: ar){
            System.out.println(el);
        }
        System.out.println("--------------------");
    }
}
