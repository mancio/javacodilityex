/*
    to color the output text
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


class TxColor {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    private static Random r = new Random();

    private static String oldpick = "null";

    private static ArrayList<String> l = new ArrayList<>(Arrays.asList(ANSI_RESET,ANSI_BLACK,ANSI_RED,ANSI_GREEN,ANSI_BLUE,ANSI_PURPLE,ANSI_CYAN));


    static ArrayList<String> getCList(){
        return l;
    }

    // choose a random color thread
    static synchronized String colPick(){

        String col = "null";
        int count = 0;
        do{
            count++;
            int n = r.nextInt(l.size());
            col = getCList().get(n);
        }while (col.equals(oldpick) && count<10);
        count = 0;
        oldpick=col;
        return col;
    }
}
