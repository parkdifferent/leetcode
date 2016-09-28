import java.util.Stack;

/**
 * Created by tianf on 2016/9/28.
 */
public class P20 {


    public static void main(String[] args) {
        //System.out.println(isValid("[sfa]{afafvb}2e(323afda"));
        System.out.println(isValid("["));
    }

    public static boolean isValid(String s) {

        char[] c =s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0;i < c.length; i++) {
            if(c[i] =='('  || c[i] =='{' ||  c[i] =='[' ) {
                stack.push(c[i]);
            }

            else if(c[i] =='}' && !stack.empty() && stack.peek()=='{') {
                stack.pop();
            }

            else if(c[i] ==')' && !stack.empty() && stack.peek()=='(') {
                stack.pop();
            }

            else if(c[i] ==']' && !stack.empty() && stack.peek()=='[') {
                stack.pop();
            }
            else return false;
        }
        return stack.empty();

    }
}
