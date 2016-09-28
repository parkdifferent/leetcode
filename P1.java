import java.util.Arrays;

/**
 * Created by tianf on 2016/9/27.
 */
public class P1 {

    public static void main(String[] args) {
        int[] nums = {0, 4, 3, 0};
        int targer = 3;
        int[] b= twoSum(nums,targer);
        for(int i=0;i<b.length;i++) {
            System.out.println(b[i]);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] b = new int[2];
        for(int i = 0;i < nums.length;i++) {
           for(int j = i +1;j < nums.length; j++) {
               if(nums[i]+nums[j] == target) {
                   b[0] = i;
                   b[1] = j;
                   break;
               }
           }
       }
        return b;
    }

}
