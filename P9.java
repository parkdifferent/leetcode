/**
 * Created by tianf on 2016/9/27.
 */
public class P9 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1234321));
    }

    public static boolean isPalindrome(int x) {

       String s = String.valueOf(x);
        boolean b =true;
        for(int i = 0;i < s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
                b = false;
                break;
            }
        }
        return b;

    }
}
