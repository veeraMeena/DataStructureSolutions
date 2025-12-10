package DSAQandA.Arrays;

/**
 * Kadnes Algorithm
 *
 * We are eliminating the subArray starting with negative or current sum ending with Negative,
 * because this won't help us to get a max sum subArray
 *
 */
public class MaximumSumInSubArray {

    public static void main(String[] args) {

    int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

    int maxSum = Integer.MIN_VALUE;
    int sum = 0;
    int startIndex=0;
    int endIndex=0;
    boolean newSubArrayflag=false;
    for(int i=0;i<arr.length;i++){
        sum = sum + arr[i];
        if(sum < 0){
            sum =0;
            newSubArrayflag = false;
        }else if(!newSubArrayflag){
            newSubArrayflag = true;
            startIndex = i;
        }
        if(sum>maxSum){
            maxSum = sum;
            endIndex = i;
        }

    }

    System.out.println(maxSum+" start "+startIndex+" endIndex "+endIndex);


    }
}
