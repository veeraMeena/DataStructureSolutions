package Arrays;

import java.util.HashSet;


/**
Question:
int a[] = {1,15,8,3,4, 10};
int target = 11;
result : 8,3

Approach:
Iterate though every Element in the array,
check  target - a[i] is there in hashset, if it is not there
store current value in the hash Set.

 Dry Run:
 i    a[i] Target-Sum  HashSet
 0    1     11-1 = 10   1
 1    15    11-15 = 4   -4
 2    8     11 -8 = 3    8
 4    3     11-3 = 8     8 is there in Hashset
 so ans is 8 and 3

 **/

public class TwoSumProblem {
    public static void main(String[] args) {
        int a[] = {1,15,8,3,4, 10};
        int target = 11;

        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<a.length;i++){
            if(set.contains(target-a[i])){
                System.out.println(a[i]+"  "+(target-a[i]));
            }else{
                set.add(a[i]);
            }
        }

    }


}
