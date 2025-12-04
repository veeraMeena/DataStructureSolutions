package Arrays;


/**
 🔹 Problem Statement

 Find the maximum possible sum of a contiguous subarray.

 Example:

 Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 Output: 6 (Subarray: [4, -1, 2, 1])

Approach1:
 nested for loop, iterate over all possible sub arrays, find the max sum
 time complexity  is O(n2)

Approach2: Kadane's Algorithm
 Either extend the current best subarray, or start a new one


**/
public class KadanesAlgorithmMaximumSubarraySum {
    public static void main(String[] args) {
        int nums[] =  {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currentSum = nums[0];
        int maxSum = nums[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for(int i=0;i<nums.length;i++){
            currentSum = currentSum + nums[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if(currentSum<0){
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        for(int i =start; i<=end;i++){
            System.out.print(nums[i]+" ");
        }


    }



}
