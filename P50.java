/**
 * Created by tianf on 2016/9/27.
 */
public class P50 {

    public static void main(String[] args) {

        System.out.println(myPow(2.0, -2147483648));

    }



    public static double myPow(double x, int n) {
        if(n == 0) {
            return 1;
        }


        if(n > 0) {
            double sum = 1;
            if(n % 2 == 0) {
                sum *= myPow(x * x, n / 2);
            }
            else {
                sum *= myPow( x * x,n / 2) * x;
            }
            return  sum;
        }
        else {
            double sum = 1;
            n = Math.abs(n);
            if( n -1 == Integer.MAX_VALUE) {
                if( x == 1 || x==-1) {
                    return 1;
                }
                return 0 ;
            }
            if(sum < 0 && sum + 1 < 0) {
                return 0;
            }
            if(n % 2 == 0) {
                sum *= myPow(x * x, n / 2);
            }
            else {
                sum *= myPow( x * x,n/2) * x;
            }
            return  1.0/sum;

        }

    }
}
