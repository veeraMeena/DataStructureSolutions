package Arrays;

import java.util.*;
/**
 Input: nums = [1, 4, 20, 3, 10, 5], target = 33
 Output: Subarray [20, 3, 10]

Approach:
 Store preFixSum and index in HashMap, iterate and check sum-target is available in hashMap

 Dry Run

 i  prefixSum sum-target  hashMap(prefixSum, index)
 0   1        1 - 33       1 , 0
 1   5        5 - 33       5,  1
 2   25       25 - 33      25, 2
 3   28       28-33=-5     28, 3
 4   38       38-33=5      5 is there in HashMap whose index is 1, so take from next index 2 to current index 4
                            (20, 3, 10)


 **/
public class FindSubArraySumWithGivenTarget {
    public static void main(String[] args) {
        int[] nums = {1, 4, 20, 3, 10, 5};
        int target = 33;
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum=nums[0];
        if(prefixSum==target){
            System.out.println("Found the sub array in index 0 ");
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==target){
                System.out.println("Found the sub array in index"+i);
            }
            prefixSum = prefixSum + nums[i];

            if(map.containsKey(prefixSum-target)){

                System.out.println("Found SubArray");
                for(int k=map.get(prefixSum-target)+1; k<=i; k++){
                    System.out.print(nums[k]+" ");
                }

            }else {
                map.put(prefixSum, i);
            }


        }

    }
}
