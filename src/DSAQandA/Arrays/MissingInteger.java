package DSAQandA.Arrays;

/**
 * Q- Given an integer array, find the first missing positive integer. There are no duplicates.
 * we have to solve in O(N) time & space complexity
 */
public class MissingInteger {
    public static void main(String[] args) {
        int A[] = {10, 3, 1, 2, 5, -8, -3, 4};

        //eliminate negative by increaing those values to N+1 and make it as positive
        for( int i=0;i<A.length;i++){
           if(A[i]<0){
               A[i] = -A[i] + (A.length+1);
           }
        }
        //iterate and mark the index to negative
        for( int i=0;i<A.length;i++){

            int index = Math.abs(A[i])-1;
            if(index<A.length){
                A[index] = -A[index];
            }

        }

        for(int i=0;i<A.length;i++){
            if(A[i]>0){
                System.out.println(i+1 +" is missing");
                break;
            }
        }




    }
}
