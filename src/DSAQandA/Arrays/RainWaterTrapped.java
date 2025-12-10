package DSAQandA.Arrays;

/**
 * Problem Description
 *
 * Imagine a histogram where the bars' heights are given by the array A. Each bar is of uniform width, which is 1 unit. When it rains, water will accumulate in the valleys between the bars.
 *
 * Your task is to calculate the total amount of water that can be trapped in these valleys.
 *
 * Approach:
 * find leftMax and right max of the current index then find the stored water
 */
public class RainWaterTrapped {
    public static void main(String[] args) {

        int A[] = {1, 2};
        int leftMax[] = new int[A.length];
        int rightMax[] = new int[A.length];
        leftMax[0] = A[0];
        rightMax[A.length-1] = A[A.length-1];
        for(int i=1;i<A.length;i++){
            if(A[i]>leftMax[i-1]){
                leftMax[i] = A[i];
            }else{
                leftMax[i] = leftMax[i-1];
            }
        }

        for(int i=A.length-2;i>=0;i--){
            if(A[i] > rightMax[i+1]){
                rightMax[i] = A[i];
            }else {
                rightMax[i] = rightMax[i+1];
            }
        }

        int total = 0;
        for(int i=1;i<A.length;i++){
           int min  =  Math.min(leftMax[i], rightMax[i]);
           if(min>A[i]) {
               int waterStored = min-A[i];
               total = total + waterStored ;
           }
        }
        System.out.println(total);
    }
}
