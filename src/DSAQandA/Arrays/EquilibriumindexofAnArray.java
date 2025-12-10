package DSAQandA.Arrays;

/**
 * 1. Calculate Prefix Sum
 * 2. in any index check Sum of Lower Bound = Sum of Higher Bound elements
 */
public class EquilibriumindexofAnArray {
    public static void main(String[] args) {
//        int A[] = {-7, 1, 5, 2, -4, 3, 0};
        int A[] = {1, 2,3};
        int pf[] = new int[A.length];
        pf[0] = A[0];
        for(int i = 1; i<A.length; i++){
            pf[i] = pf[i-1] + A[i];
        }

        int lowerBound = 0;
        int higherBound = 0;
        boolean result = false;
        for( int i=0;i<A.length;i++){
            if(i==0){
                lowerBound = 0;
                higherBound = pf[pf.length-1] - pf[i];

            }else{
                lowerBound = pf[i-1];
                higherBound = pf[pf.length-1] - pf[i];
            }
            if(lowerBound==higherBound){
                System.out.println(i);
                result = true;
                break;
            }
        }
        if(!result){
            System.out.println(-1);
        }
    }
}
