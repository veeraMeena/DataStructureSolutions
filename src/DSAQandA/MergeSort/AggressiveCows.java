package DSAQandA.MergeSort;

/**
 * find min distance between the cow is max
 */
public class AggressiveCows {
    public static void main(String[] args) {
        int a[] = {0,3,4,7,9,10};
        int cows = 4;
        int l = 1;
        int r = a[a.length-1] - a[0];
        int max = 0;
        while(l<=r){

            int mid = l+(r-l)/2;

            boolean flag = canWePlace(a,mid, cows);
            if(flag){
                max = Math.max(max, mid);
                l=mid+1;
            }else {
               r=mid-1;
            }
        }
        System.out.println(max);
    }
    public static boolean canWePlace(int[] a, int distance, int cows){
        int placedCows = cows-1;
        int previouslyPlaceCowDis = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]-previouslyPlaceCowDis >=distance){
                previouslyPlaceCowDis = a[i];
                placedCows--;
            }
            if(placedCows==0){
                return  true;
            }
        }
        return  false;
    }
}
