/**
 * Created by tianf on 2016/9/28.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(a, 7));
    }

    public static int binarySearch(int[] a ,int targer) {

        int left = 0;
        int right = a.length -1;

        while(left <= right) {
            int middle = left + ((right - left) >> 1);  //防止溢出，移位也更高效。同时，每次循环都需要更新。
            if(a[middle] < targer) {
                left = middle +1;
            }
            else if(a[middle] > targer) {
                right = middle -1;
            }
            else
                return middle;
        }
        return -1;

    }

}


