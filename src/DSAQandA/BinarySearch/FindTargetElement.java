package DSAQandA.BinarySearch;

/**
 * Binary Search: Implement binary search to find a target element in a sorted array.
 */
public class FindTargetElement {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,6,7,8};
        int target = 1;

        int i=0;
        int j=A.length-1;
        while(i<=j && j>=0 && i<A.length){
            int mid = i + (j-i)/2;
            if(A[mid]==target){
                System.out.print("found");
            }
            if(A[mid]>target){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
    }
}
