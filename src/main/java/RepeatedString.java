// https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

public class RepeatedString {
    public static void main(String[] args) {

        String s = "aba";
        long n = 10;

        // aba aba aba a

        // abaa abaa ab

        System.out.println(repeatedString(s,n));

    }

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long count = 0;
        long plus = 0;

        long res = n%s.length();


        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                count++;
            }
        }

        for (int j = 0; j<res; j++){
            if(s.charAt(j)=='a'){
                plus++;
            }
        }

        return count*(Math.abs(n/s.length()))+plus;

    }
}
