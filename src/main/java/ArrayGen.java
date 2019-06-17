
public class ArrayGen {

    // array of paired value with only except one (odd occurrence)
    static  int[] oneodd(int n, int dim){

        if(dim%4!=1){
            int[] A = {9,3,9,7,9,3,9};
            return A;
        }

        int[] A = new int[dim];

        int n1 = n;
        int n2 = n-1;

        boolean sw = true;

        for(int i = 0; i < A.length-1; i++){

            if(sw){
                A[i] = n1;
                sw = false;
            }else{
                A[i] = n2;
                sw = true;
            }
        }

        A[dim-1] = A[dim-2];


        return A;

    }
}
