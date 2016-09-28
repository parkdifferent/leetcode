/**
 * Created by tianf on 2016/9/27.
 */
public class P7 {
    public static void main(String[] args) {

        long r1 =reverse1(1534236469);  //2147483647

        //long r2 =reverse1(-2147483648);
        System.out.println(r1);

        //int a= Integer.MAX_VALUE +1;
        //System.out.println("a="+a);

       /* int r2 =reverse1(-123);
        System.out.println(r2);

        int r3 =reverse1(0);
        System.out.println(r3);*/

    }

    public static int reverse1(int x) {
        if(x ==0)
            return 0;
        int x1 = Math.abs(x);
        int y;
        int sum= 0;

        int k = 0;
        for(int i = 0; i < 10; i++) {
            if( x1 >= Math.pow(10,i) && x1 <Math.pow(10,i+1)) {
                k = i;
                //System.out.println(k);
                break;
            }
        }

        while(x1!=0) {
            y = x1 % 10;
            x1 = x1/10;
            sum += y * Math.pow(10,k);
            k--;
            if(sum < 0 || sum + 1 < 0) {
                return 0;
            }
        }
        return x > 0 ? sum : -sum;
    }

}
