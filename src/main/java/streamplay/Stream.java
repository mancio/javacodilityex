package streamplay;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        int[] a = {1,2,4,5,6,7};
        int[] b = {2,7,9};
        List<Integer> lis = trans(a);
        List<Integer> lis2 = trans(b);
        System.out.println("every number plus one");
        System.out.println(plusOne(lis));
        System.out.println("every pair pos number in the array");
        System.out.println(pairs(lis));
        System.out.println("common elements");
        System.out.println(common(lis,lis2));
        System.out.println("NOT common elements");
        System.out.println(notCommon(lis,lis2));
    }

    //from int[] to arraylist
    static List trans(int[] array){
        List<Integer> lis = new ArrayList<>();
        for (Integer i: array) {
            lis.add(i);
        }
        return lis;
    }

    // print numbers of array +1
    static List plusOne(List<Integer> a){
        return a.stream().map(n -> n+2).collect(Collectors.toList());
    }

    // print only numbers in pair position of array
    static List pairs(List<Integer> a){
        return a.stream().filter(n -> a.indexOf(n)%2==0).collect(Collectors.toList());
    }

    // print only numbers in common
    static List common(List<Integer> one, List<Integer> two){
        return one.stream().distinct().filter(two::contains).collect(Collectors.toList());
    }

    // print only numbers not in common
    static List notCommon(List<Integer> one, List<Integer> two){
        return one.stream().distinct().filter(n ->!two.contains(n)).collect(Collectors.toList());
    }



}
