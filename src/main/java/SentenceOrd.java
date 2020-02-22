/* Qualtrics Krakow Tech Screen 3.2
1. Arrange the Words
A sentence is defined as a string of space-separated
words that starts with a capital letter followed by
lowercase letters and spaces, and ends with a period,
i.e., it satisfies the regular expression A/A-Zila-z]*\.$.
Rearrange the words in a sentence while respecting the
following conditions :
1. Each word is ordered by length, ascending.
2. Words of equal length must appear in the same order
as in the original sentence.
3. The rearranged sentence must be formatted to satisfy
the regular expression AIA-Zli-a-z .11.$
Example
sentence = Cats and hats.
Order the sentence by word's length and keep the
original order for the words with the same length.
• Length 3: {and}
• Length 4: {Cats, hats}
Reassemble the sequence of words so that the first
letter is uppercase, the intermediate letters are
lowercase, and the last one is a period.
The result is ' And cats hats.'
Function Description
Complete the function arrange in the editor below.
arrange has the following parameter(s): string sentence: a well formed sentence string Returns: string: an ordered sentence string
Constraints
• 1 length of sentence < 105
• Input Format for Custom Testing
Input from stdin will be processed as follows and passed to the function.
A single line of space-separated words, sentence.
• Sample Case 0
Sample Input 0
STDIN
Function
The lines are printed in reverse order. 4 sentence = 'The lines are printed in reverse order.'
Sample Output 0 In the are lines order printed reverse. Explanation 0 Order the sentence by the lengths of the words and keep the original order for the words with the same length.
• Length 2: {in) • Length 3: {the, are). S • Length 5: {lines, order). same length, keep the original order. • Length 7: {printed, reverse). same length, keep the original order.
Reassemble the sequence of words so that the first letter is uppercase, the intermediate letters are lowercase, and the last one is a period. The result is ' In the are lines order printed reverse.'
♦ Sample Case 1
sample Input 1
STDIN Function
Here i come. 4 sentence = 'Here i come.' Sample Output 1 I here come.
Explanation 1 Order the sentence by the lengths of the words and keep the original order for the words with the same length.
• Length 1: {i) • Length 4: {here, come)
Reassemble the sequence of words so that the first letter is uppercase, the intermediate letters are lowercase, and the last one is a period. The result is ' / here come'.
• Sample Case 2
Sample Input 2 STDIN
Function
I love to code. 4 sentence = 'I love to code.' Sample Output 2 I to love code. Explanation 2 Order the sentence by the lengths of the words and keep the original order for the words with the same length.
• Length 1: {i} • Length 2: {to} • Length 4: {love, code}
Reassemble the sequence of words so that the first letter is uppercase, the intermediate letters are lowercase, and the last one is a period. The result is ' 1 to love code.'



 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SentenceOrd {

    public static void main(String[] args) {
        String s = "Ciao come va"; // Va ciao come
        System.out.println(arrange(s));
    }

    static String arrange(String sentence) {
        int lg = sentence.length();

        String[] str = sentence.split(" ");

        ArrayList<String> ar = new ArrayList<>(Arrays.asList(str));

        ar.sort(Comparator.comparingInt(String::length));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<ar.size();i++) {
            String actstr = ar.get(i);
            if(i == 0){
                String frUP = actstr.substring(0,1).toUpperCase()
                        + actstr.substring(1);
                sb.append(frUP);
            }else {
                sb.append(actstr.toLowerCase());
            }
            sb.append(" ");
        }


        return sb.toString();
    }
}
