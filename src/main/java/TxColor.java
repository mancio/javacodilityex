/*
    to color the output text
 */

import java.util.ArrayList;
import java.util.Arrays;


public class TxColor {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    private ArrayList<String> l;

    TxColor(){
        l = new ArrayList<>(Arrays.asList(ANSI_RESET,ANSI_BLACK,ANSI_RED,ANSI_GREEN,ANSI_BLUE,ANSI_PURPLE,ANSI_CYAN));
    }

    public ArrayList<String> getCList(){
        return l;
    }



}
