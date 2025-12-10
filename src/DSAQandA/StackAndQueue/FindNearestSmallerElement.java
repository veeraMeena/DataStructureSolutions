package DSAQandA.StackAndQueue;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Stack;

public class FindNearestSmallerElement {
    public static void main(String[] args) {
        int A[] = {4,5,2,10,8};
        int result[] = new int[A.length];
        Stack<Integer> stack = new Stack<>();
        result[0] = -1;
        int i=0;
        while(i<A.length){
            if(stack.isEmpty()){
                result[i] = -1;
                stack.push((A[i]));
                i++;
            }
            else if( stack.peek() <A[i] ){
                result[i] = stack.peek();
                stack.push(A[i]);
                i++;
            }else{
                stack.pop();
            }
        }
        for(int k: result){
            System.out.print(k+" ");
        }
    }
}
