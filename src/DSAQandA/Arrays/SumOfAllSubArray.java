package DSAQandA.Arrays;

/**
 * create some exmples, create formular
 * In each sub array, few elements will be repeating based on that need to create a formula
 *
 * arr[i] * (i+1) number of time repeating in all sub Array  * (n-i) each time how many values are there
 *
 * 1, 2, 3
 * 1 . 12 . 123
 * 2. 23
 * 3
 *
 *
 *
 */
public class SumOfAllSubArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        long sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum = sum + ( arr[i] * (i+1)  * (arr.length - i));
        }
        System.out.println(sum);
    }
}
