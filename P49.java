import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tianf on 2016/9/28.
 */
public class P49 {
    public static void main(String[] args) {
       // System.out.println("bat".hashCode());
       // System.out.println("tba".hashCode());


        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists= groupAnagrams(strings);
        for (List<String> list : lists) {
            for (String s :list) {
                System.out.println(s);
            }
            System.out.println("--------------");
        }

    }


    public static List<List<String>> groupAnagrams(String[] strs) {

        int[] hash = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};

        Map<Integer,List<String>> map = new HashMap<Integer, List<String>>();
        List<List<String>> res = new ArrayList<List<String>>();
        for (String s :strs) {
            int hashCode = 1;
            List<String> list = new ArrayList<String>();
            for (char c : s.toCharArray()) {
                hashCode *= hash[c-'a'];
            }

            if (map.containsKey(hashCode)) {
                list = map.get(hashCode);
                list.add(s);
                map.put(hashCode,list);

            } else {
                list.add(s);
                map.put(hashCode,list);
            }
        }

        for (Map.Entry<Integer,List<String>> entry : map.entrySet()) {
            List<String> list = entry.getValue();
            res.add(list);
        }
        return res;




    }
}
