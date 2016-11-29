/**
 * Created by tianf on 2016/11/25.
 */
public class P24 {

    public ListNode swapPairs1(ListNode head) {


    return null;

    }

    public ListNode swapPairs(ListNode head) {
        if ((head == null)||(head.next == null))
            return head;
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
    }

    public ListNode swapPairs2(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode second = head.next;
        ListNode third = second.next;

        second.next = head;
        head.next = swapPairs(third);

        return second;
    }

    public static int  digui(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n * digui(n-1);
        }
    }

    public static void main(String[] args) {

        System.out.println(digui(3));
    }


}


