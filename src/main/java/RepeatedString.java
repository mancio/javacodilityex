// https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

public class RepeatedString {
    public static void main(String[] args) {

        String s = "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm";
        long n = 736778906400L;
        System.out.println(n);
        // aba aba aba a

        // abaa abaa ab

        // a a a a a a a a a a

        System.out.println(repeatedString(s,n));

    }

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long count = 0L;
        long plus = 0;

        long[] a = new long[s.length()];

        int res = (int) Math.abs(n % s.length());


        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='a') {
                count++;
            }
            a[i] = count;
        }

        long fp = count*(Math.abs(n/s.length()));
        long sd = 0;

        if(res == 0L){
            return fp;
        }else {
            return fp + a[res-1];
        }



    }
}

/*
    ALL TEST PASSED! note that Math.toIntExact() is been
    introduced with java 8. So you can use
    int res = (int) Math.abs(n % s.length());
    uncontrolled casting is unsafe.
 */
