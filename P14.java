import java.util.Arrays;

/**
 * Created by tianf on 2016/9/28.
 */
public class P14 {

    public static void main(String[] args) {
        String[] strs = {"hell","aelle","hello"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length ==0 || strs==null) {
            return "";
        }

        Arrays.sort(strs);
        String begin = strs[0];
        String end = strs[strs.length-1];
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<begin.length();i++) {
            if(end.length()> i && begin.charAt(i) == end.charAt(i)) {
                sb.append(begin.charAt(i));
            }
            else {
                return sb.toString();
            }
        }
        return sb.toString();

    }
}
