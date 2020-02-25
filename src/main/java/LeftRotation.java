// https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

import java.util.Arrays;

public class LeftRotation {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int rot = 1;
        System.out.println(Arrays.toString(leftRot(arr, rot)));

    }

    static int[] leftRot(int[] arr, int rot){
        int[] out = new int[arr.length];
        for(int i=0; i<arr.length;i++){
            int next = (i+rot)%(arr.length-1);

            out[i] = arr[next];


        }
        return out;
    }
}
