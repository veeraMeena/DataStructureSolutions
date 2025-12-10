package DSAQandA.Arrays;

/**
 * Step
 * Reverse the whole Array
 * Reverse the Array from index 0 to k-1
 * Reverse the Array from index k to A.length-1
 */
public class RotateArray {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        int k=6;
        if(k>A.length){
            k = k%A.length;
        }
        reverseArray(A, 0, A.length-1);
        reverseArray(A, 0, k-1);
        reverseArray(A, k, A.length-1);
        for( int l : A){
            System.out.print(l+" ");
        }

    }
    public static  void reverseArray(int A[], int i, int j){
        while(i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }

    }
}
