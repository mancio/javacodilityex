import java.util.ArrayList;
import java.util.Comparator;

public class SentenceOrd {

    public static void main(String[] args) {
        String s = "Ciao come va"; // Va ciao come
        System.out.println(arrange(s));
    }

    static String arrange(String sentence) {
        int lg = sentence.length();

        String[] str = sentence.split(" ");

        ArrayList<String> ar = new ArrayList<>();

        for(String s: str){
            ar.add(s);
        }

        ar.sort(Comparator.comparingInt(String::length));

        StringBuffer sb = new StringBuffer();

        for (String s : ar) {
            sb.append(s);
            sb.append(" ");
        }
        String stord = sb.toString();



        return stord;
    }
}
