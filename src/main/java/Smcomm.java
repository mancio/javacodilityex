/*
Given 3 random arrays of integers, write a method to find the smallest number that is common among the 3 arrays. HINT: Sort first and just traverse first few elements until you reach the common number
  [-1,-2, 4,5,6,1,2,3,3,3,1,1,1]
  [54,6,7,8,1,3,5,1]
  [1,6,9,1,0,2,1]
  result = 1
 */

import java.util.*;
import java.util.stream.Collectors;

public class Smcomm {

    public static void main(String[] args) {
        int[] A = {-1,-2,4,5,6,1,2,3,3,3,1,1,1};
        int[] B = {54,6,7,8,1,3,5,1};
        int[] C = {1,6,9,1,0,2,1};

        TimeTest t1 = new TimeTest("arraylist");
        TimeTest t2 = new TimeTest("stream");
        TimeTest t3 = new TimeTest("hash");



        /*t1.start();
        // find min common using sort and loop
        with_arr(A,B,C);
        t1.finish();
        t1.exec_time();


        t2.start();
        // find min common using sort and stream list
        with_stream(A,B,C);
        t2.finish();
        t2.exec_time();*/



        t3.start();
        // find min common using sort and stream list
        with_set(A,B,C);
        t3.finish();
        t3.exec_time();


    }

    static void with_set(int[] A, int[] B, int[] C){
        LinkedHashSet<Integer> s1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> s2 = new LinkedHashSet<>();
        LinkedHashSet<Integer> s3 = new LinkedHashSet<>();

        for(int el: A){
            s1.add(el);
        }

        for(int el: B){
            s2.add(el);
        }

        for(int el: C){
            s3.add(el);
        }


        s1.stream().sorted((Integer el1, Integer el2)-> el1<el2 ? 1 : el1==el2 ? 0 : -1);


        Printer.vlist(s1);
        Printer.vlist(s2);
        Printer.vlist(s3);

       boolean min = false;

       for(int e: s1){
           if(s2.contains(e) && s3.contains(e)){
               System.out.println(e);
               min = true;
               break;
           }
       }
       if(!min){
           System.out.println("no el");
       }

    }

    static void with_stream(int[] A, int[] B, int[] C){
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new LinkedList<>();

        for(int el: A){
            list1.add(el);
        }

        for(int el: B){
            list2.add(el);
        }

        for(int el: C){
            list3.add(el);
        }



        list1.sort(Comparator.naturalOrder());
        list2.sort(Comparator.naturalOrder());
        list3.sort(Comparator.naturalOrder());

        Set<Integer> commonElements = list1.stream().filter(list2::contains).filter(list3::contains).collect(Collectors.toSet());
        int minimumCommonElement = Collections.min(commonElements);

        System.out.println(minimumCommonElement);

    }






    static void with_arr(int[] A, int[] B, int[] C){
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ArrayList<Integer> ar2 = new ArrayList<Integer>();
        ArrayList<Integer> ar3 = new ArrayList<Integer>();

        for(int el: A){
            ar1.add(el);
        }

        for(int el: B){
            ar2.add(el);
        }

        for(int el: C){
            ar3.add(el);
        }

        Collections.sort(ar1);
        Collections.sort(ar2);
        Collections.sort(ar3);

        /*printer(ar1);
        printer(ar2);
        printer(ar3);*/

        if(!finder(ar1,ar2,ar3)){
            System.out.println("no elements");
        }
    }

    static boolean finder(ArrayList ar1, ArrayList ar2, ArrayList ar3) {
        for (int i = 0; i < ar1.size(); i++) {
            Object el = ar1.get(i);
            if (ar2.contains(el) && ar3.contains(el)) {
                System.out.println(el);
                return true;
            }
        }
        return false;

    }






}
