import java.text.NumberFormat;
import java.util.Locale;

public class MaxValues {

    static String getInt(){

        String n = NumberFormat.getNumberInstance(Locale.ITALY).format(Integer.MAX_VALUE);

        return n;
    }

    //get the value of MAX_VALUE from any Object extending Number
    static String getType(Object N){

        String s = "0";



        try {
            s = N.getClass().getDeclaredField("MAX_VALUE").get(null).toString();
        }catch (Exception e){
            System.out.println("wrong number");
        }

        return String.format("%,.5f",Double.valueOf(s));



    }

}
