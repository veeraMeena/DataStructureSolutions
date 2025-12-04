package Arrays;

public class FindMaximumElementInArray {

    public static void main(String[] args) {
        int a[] = {1,15,8,3,4, 10};
        int max = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println(max);

    }
}
