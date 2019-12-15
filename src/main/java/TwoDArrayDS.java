// https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

public class TwoDArrayDS {

    public static void main(String[] args) {

        int[][] arr = {
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0}
        };

        int[][] arr2 = {
                {0, -4, -6, 0, -7, -6},
                {-1, -2, -6, -8, -3, -1},
                {-8, -4, -2, -8, -8, -6},
                {-3, -1, -2, -5, -7, -4},
                {-3, -5, -3, -6, -6, -6},
                {-3, -6, 0, -8, -6, -7}
        };

        System.out.println(hourglassSum(arr2));

    }

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        int[][] pat = {
                {1,1,1},
                {0,1,0},
                {1,1,1}
        };

        int v,h,sv,sh,sum,tot;
        v=h=sv=sh=sum=0;

        tot = Integer.MIN_VALUE;

        int line= 0;

        while(sv<4) {
            for (int i = sv; i < sv+3; i++) {
                for (int j = sh; j < sh+3; j++) {
                    if (pat[v][h] == 1) {
                        System.out.println(line++ + " Reading: " + arr[i][j]);
                        sum += arr[i][j];
                    }
                    h++;
                }
                h = 0;
                v++;
            }
            v = 0;

            if(sum>tot){
                tot=sum;
            }

            sum=0;

            if(sh<3){
                sh++;
            }else {
                sv++;
                sh=0;
            }
        }

        return tot;
    }

}

// PASS ALL TESTS!!
/*
    remember initialize tot number to the smallest integer
    the matrix should contain numbers below zero
 */
