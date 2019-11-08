import java.util.ArrayList;


public class ForEachArray {

    public static void main(String[] args) {
        System.out.println(sol());
    }

    static ArrayList<Integer> sol(){
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = 0; i<7; i++){
            ar.add(i);
        }

        ar.forEach(i->ar.set(i,i+45));

        return ar;
    }
}
