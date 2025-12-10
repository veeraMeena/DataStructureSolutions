package DSAQandA.Arrays;

/**
 * Given an array A of length N. Also given are integers B and C.
 *
 * Return 1 if there exists a subarray with length B having sum C and 0 otherwise
 * Input 1:
 *
 *
 * A = [4, 3, 2, 6, 1]
 * B = 3
 * C = 11
 * Output 1:
 * 1
 *
 * Approach
 * two pointer
 */
public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int A[] = {4, 3, 2, 6, 1};
        int B = 3;
        int C = 11;
        int i=0;
        int j = 0;
        int sum = 0;
        while(j<B){
            sum = sum+A[j];
            j++;
        }
        if(sum==C){
            System.out.println("found "); //return 1
        }

        while(j<A.length){
            sum = sum-A[i] + A[j];
            if(sum==C){
                System.out.println("found "); //return 1
            }
            i++;
            j++;
        }

    }
}
