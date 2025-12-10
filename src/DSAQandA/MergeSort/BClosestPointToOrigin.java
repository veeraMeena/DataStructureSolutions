package DSAQandA.MergeSort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Given the number of points(x,y) We need to B numbers of points are closure to orgin 0,0
 *
 */
public class BClosestPointToOrigin {

    public static void main(String[] args) {
        int A[][] = {{1,3},{-2,2}};

        Arrays.sort(A, new Comparator<int []>(){
            public int compare(int A[], int B[]){
                int d1 = A[0]*A[0] + A[1]*A[1];
                int d2 = B[0]*B[0] + B[1]*B[1];
                return  d1 - d2;
            }
        });

        int min = 0;
        int B = 1;
        int C[][] = new int[B][2];
        for(int i=0;i<B;i++){
            C[i][0] = A[i][0];
            C[i][1] = A[i][1];
        }
        System.out.print(C[0][0]+" "+C[0][1]);
    }
}
