/**
 * Created by tianf on 2016/11/25.
 */
public class P28 {

    public static int strStr(String haystack, String needle) {
        if(  "".equals(needle)) {
            return 0 ;
        }
        if(  "".equals(haystack) && !"".equals(needle) ) {
            return -1 ;
        }

        if(needle.length() > haystack.length()) {
            return 0;
        }

        if(haystack.equals(needle)) {
            return 0;
        }

        if(haystack.charAt(0)==needle.charAt(0) && needle.length()==1) {
            return 0 ;
        }

        int length = needle.length();
        boolean b = false;
        int index = 0;
        char c = needle.charAt(0);
        for(int i = 0;i <haystack.length();i++) {
            char t = haystack.charAt(i);
            if(t == c) {
                for (int j = i+1,k= 1; j < i+length && j <haystack.length();j++) {
                    if (haystack.charAt(j) == needle.charAt(k)) {
                        k++;
                        if(k == length) {
                            b = true;
                            index = i;
                            break;
                        }

                    }
                    else {
                        break;
                    }
                }
            }
            if (b) {
                return index;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        System.out.println(strStr("aaa","aaaa"));
        System.out.println(strStr("mississippi","issipi"));
        System.out.println(strStr("","a"));
    }

    public int strStr1(String haystack, String needle) {
        if(haystack == null || needle == null || needle.length() > haystack.length()) return -1;

        int len = haystack.length(), i = 0, j = 0, pos = 0;
        while(i < len && j < needle.length()) {
            if(haystack.charAt(i++) == needle.charAt(j)) {
                j++;
            } else {
                i = i - j;
                j = 0;
                pos = i;
            }
        }
        return j == needle.length()? pos : -1;
    }

}
