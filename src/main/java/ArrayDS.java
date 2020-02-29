import java.util.Arrays;

// https://www.hackerrank.com/challenges/arrays-ds/problem
public class ArrayDS {
    public static void main(String[] args) {
        int[] in = {1,2,3,4,5};
        System.out.println(Arrays.toString(revar(in)));


    }

    static int[] revar(int[] in){
        int dim = in.length;
        int[] out = new int[dim];
        for(int i=0;i<dim;i++){
            out[i] = in[dim-1-i];
        }
        return out;
    }
}
