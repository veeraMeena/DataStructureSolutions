package DSAQandA.Hashing;

import java.util.HashMap;

/**
 *
 */
public class LongestSubArrayZeroSum {
    public static void main(String[] args) {
        int A[] = {1,-1,3,2,-2,-8,1,7,10,23};
        HashMap<Integer, Integer> aMap = new HashMap<>();
        int l=0,r=0;
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum = sum + A[i];
            if(sum==0){
                l=0;
                r=i;
            }
            if(aMap.containsKey(sum)){
               int ll = aMap.get(sum) + 1;
               int  lr = i;
               if((lr-ll)>(r-l)){
                   l = ll;
                   r = lr;
               }
            }
            aMap.put(A[i], i);
        }
        System.out.println(l+" "+r);
    }
}
