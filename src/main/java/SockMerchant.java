/*
https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */

import java.util.HashMap;

public class SockMerchant {
    public static void main(String[] args) {

        int n = 7;
        int[] ar = {1,2,1,2,1,3,2};

        System.out.println(sockMerchant(n, ar));

        System.out.println("integer div test: " + 1/2);
    }

    static int sockMerchant(int n, int[] ar) {

        HashMap<Integer,Integer> col = new HashMap<>();

        int pairs = 0;

        for(int i=0; i<n; i++){
            if(col.containsKey(ar[i])){
                col.put(ar[i], col.get(ar[i])+1);
            }else {
                col.put(ar[i], 1);
            }
        }

        for (int i: col.keySet()){
            System.out.println("sock: " + i + " n = " + col.get(i));
        }

        for (int cl: col.keySet()){
            int p = col.get(cl)/2;
            if(p>0){
                pairs+=p;
            }
        }

        return pairs;
    }

}

// ALL TEST PASSED!!!!


