/*
write a parser that validate only the string with open and close brackets
{},[],() I can have whatever in the middle
 */

import java.util.ArrayList;
import java.util.List;

public class Parsy {

    public static void main(String[] args) {

        String s = "[{}]{}[{}]{}[{}]{}[{}]{}[{}]{}[{}]{}[{}]{}[{}]{}[{}]{}[{}]{}";
        System.out.println(parsy(s));

    }

    static boolean parsy(String s) {

        List<Character> ls = new ArrayList<>();

        char prev = ' ';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (ls.size() > 0) {
                prev = s.charAt(i - 1);
            }
            if (c == ')' || c == '}' || c == ']') {
                if (ls.isEmpty()) {
                    return false;
                } else if ((prev == '(' && c == '}') ||
                        (prev == '(' && c == ']') ||
                        (prev == '[' && c == '}') ||
                        (prev == '[' && c == ')') ||
                        (prev == '{' && c == ']') ||
                        (prev == '{' && c == ')')) {
                    return false;
                } else {
                    ls.remove(ls.size()-1);
                }

            } else {
                ls.add(c);
            }

        }

        if (ls.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

}

/*
   BBH company test exercise interview
   set an if condition to be sure to avoid out of bound error when you save prev value
   of the array
 */
