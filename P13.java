import java.util.HashMap;
import java.util.Map;

/**
 * Created by tianf on 2016/9/28.
 */
public class P13 {

    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result=map.get(s.charAt(0));
        int prev=result;
        for(int i=1;i<s.length();i++){
            int curr=map.get(s.charAt(i));
            if(curr>prev)
                result+=curr-2*prev;
            else
                result+=curr;
            prev=curr;
        }
        return result;

    }
}


