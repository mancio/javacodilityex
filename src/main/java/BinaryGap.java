/*
     A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

    For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps.

    Write a function:

    int solution(int N);

    that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

    For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.

    Assume that:

    N is an integer within the range [1..2,147,483,647].
    Complexity:

    expected worst-case time complexity is O(log(N));
    expected worst-case space complexity is O(1).

*/


// ATTENTION! IS WRONG IN SOME CASES CHECK WITH CODABILITY


import java.util.ArrayList;

public class BinaryGap {


    public static void main(String[] args) {

        int n = 15;
        int b = Integer.valueOf(Integer.toBinaryString(n));
        //b = 10100;
        //int b = Integer.valueOf(st);
        System.out.println(b);
        ArrayList<Integer> list = toArray(b);
        //Printer.vlist(list);
        findzero(list);

    }


    static ArrayList<Integer> toArray(int n) {

        ArrayList<Integer> arl = new ArrayList<>();

        int num = n;

        do {
            arl.add(num % 10);
            num /= 10;
        } while (num != 0);

        return arl;
    }

    static void findzero(ArrayList<Integer> ar) {

        boolean open = false;
        int n = 0;
        int n2 = 0;

        for (int i = 1; i < ar.size()-1; i++) {
            if ((ar.get(i) == 0 && (ar.get(i - 1) == 1 || ar.get(i + 1) == 0)) ||
                    (ar.get(i) == 0 && ar.get(i-1) == 0 && ar.get(i+1) == 1 )){
                n++;
            }else{
                if(n>=n2){
                    n2 = n;
                    n = 0;
                }
            }

        }
        if(n>=n2) {
            n2 = n;

        }

        System.out.println("binary gap = " + n2);
        System.out.println("dim array = " + ar.size());

    }
}