import java.util.Arrays;

/**
 * Created by tianf on 2016/9/27.
 */
public class P4 {

    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {8};

        double median = findMedianSortedArrays1(nums1,nums2);
        System.out.println(median);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int size1 = nums1.length;
        int size2 = nums2.length;
        int[] c = new int[size1+size2];
        for(int i = 0; i<size1; i++) {
            c[i] = nums1[i];
        }
        for(int j = 0; j<size2;j++) {
            c[size1+j] = nums2[j];
        }
        Arrays.sort(c);
        double median;
        int size = size1 + size2;
        if((size1+size2) % 2 ==0) {

            median = (c[size/2-1] + c[size/2])/2.0;
        }
        else  {
            median =c[size/2];
        }
        return median;
    }

    public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if(m > n) {
            return findMedianSortedArrays1(nums2,nums1);
        }
        int imin = 0;
        int imax = m;
        int half_len = (m+n+1)/2;
        while(imin <= imax) {
            int i = imin + ((imax - imin) >> 1);
            int j = half_len - i;
            if(j > 0 && i < m && nums2[j-1] > nums1[i]) {
                imin = i + 1;
            }
            else if(i > 0 && j < n && nums1[i-1] > nums2[j]) {
                imax = i -1;
            }
            else {

                int max_of_left  = 0;
                if( i == 0) {
                    max_of_left = nums2[j-1];
                }
                else if(j == 0) {
                    max_of_left = nums1[i-1];
                }
                else {
                    max_of_left = Math.max(nums1[i-1],nums2[j-1]);
                }

                if ((m + n) % 2 == 1) {
                    return max_of_left;
                }
                int min_of_right;

                if(i == m) {
                    min_of_right = nums2[j];
                }
                else if (j == n) {
                    min_of_right = nums1[i];
                }
                else{
                    min_of_right = Math.min(nums1[i], nums2[j]);
                }

                return (max_of_left + min_of_right) / 2.0;
            }

        }
        return 0;
    }
}
