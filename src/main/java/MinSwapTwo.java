import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//https://www.hackerrank.com/challenges/minimum-swaps-2
public class MinSwapTwo {
    public static void main(String[] args) {

    }

    static int minimumSwaps(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                while(arr[i]!=i+1){
                    int temp = 0;
                    temp = arr[arr[i]-1];
                    arr[arr[i]-1] = arr[i];
                    arr[i] = temp;
                    count++;
                }
            }
        }
        return count;
    }




}



