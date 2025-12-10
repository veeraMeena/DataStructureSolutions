package DSAQandA.MergeSort;

/**
 * mergeSort(0,4)
 * ├─ mergeSort(0,2)
 * │  ├─ mergeSort(0,1)
 * │  │  ├─ mergeSort(0,0) -> [5]
 * │  │  └─ mergeSort(1,1) -> [3]
 * │  │  └─ merge(0,0,1) -> [3,5]
 * │  └─ mergeSort(2,2) -> [8]
 * │  └─ merge(0,1,2) -> [3,5,8]
 * └─ mergeSort(3,4)
 *    ├─ mergeSort(3,3) -> [4]
 *    └─ mergeSort(4,4) -> [2]
 *    └─ merge(3,3,4) -> [2,4]
 * └─ merge(0,2,4) -> [2,3,4,5,8]
 *
 * Time Complexity
 * Work = (work per level) × (number of levels)
 * Work = n × log n
 *
 * In summary:
 * Auxiliary Space: O(N) due to the temporary array used for merging.
 * Recursive Stack Space: O(log N) in the worst case, as the recursion depth is logarithmic.
 * Overall Space Complexity: O(N) because the auxiliary space requirement is the dominant factor.
 */
public class mergeSort {
    public static void main(String[] args) {
        int arr[] = {5,1,3,2,4};

        int left = 0;
        int right = arr.length-1;
        int mid = left + (right - left)/2;
        mergeSortCall(arr, left, mid, right);
        for(int i: arr)
        System.out.print(i);
    }

    public  static void mergeSortCall(int arr[], int left, int mid, int right){

        if(left>=right){return;}
        int l = left;
        int r = mid;
        int m = l + (r - l)/2;
        mergeSortCall(arr,l,m,r);
        l = mid+1;
        r = right;
        m = l + (r - l)/2;
        mergeSortCall(arr, l, r, m );
        mergeSorted(arr, left, mid, right);
    }
    public static void mergeSorted(int arr[], int left, int mid, int right){
        int temp[] = new int[right - left + 1];
        int i = left;
        int j = mid+1;
        int k=0;
        while (i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j<=right){
            temp[k] = arr[j];
            k++;
            j++;
        }
        for(int l=0;l<temp.length;l++){
            arr[left] = temp[l];
            left++;
        }
    }
}
