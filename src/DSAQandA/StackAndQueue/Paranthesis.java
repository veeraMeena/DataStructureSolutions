package DSAQandA.StackAndQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Paranthesis {
    public static void main(String[] args) {
        String input = "())";
        Stack<Character> stack = new Stack<>();
        boolean balanced = true;
        for(char c : input.toCharArray()){
            if(c=='('){
                stack.push(c);
            }
            if(c==')'){
                if(stack.size()>0 && stack.peek()=='('){
                    stack.pop();
                }else{
//                    System.out.println("not balanced");
                    balanced = false;
                    break;
                }
            }
        }
        if(balanced && stack.isEmpty()){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }

}
