/**
 * Created by tianf on 2016/11/25.
 */
public class P21 {

    public static void main(String[] args) {
        ListNode s = new ListNode(1);

        s.next = new ListNode(9);

        ListNode t  = new ListNode(2);

        t.next = new ListNode(12);

        ListNode sm= mergeTwoLists(s,t);
        while (sm != null) {
            System.out.println(sm.val);
            sm = sm.next;
        }


    }



    public static ListNode mergeTwoLists1(ListNode l1,ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode prev = ans;
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                prev.next = l2;
                l2 = l2.next;
            } else{
                prev.next = l1;
                l1 = l1.next;
            }
            prev = prev.next;
        }
        if(l2 == null){
            prev.next = l1;
        } else {
            prev.next = l2;
        }
        return ans.next;
    }


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode p = l1;
        ListNode q = l2;
        if (p.val < q .val) {
            head = new ListNode(p.val);
            p = p.next;
        }
        else {
            head = new ListNode(q.val);
            q = q.next;
        }

        ListNode s = head;


        while (p != null && q != null) {
            if(p.val < q.val) {
                //ListNode t = new ListNode(p.val);
                s.next = p;
                p = p.next;
            }
            else {
                //ListNode t = new ListNode(q.val);
                s.next = q;
                q = q.next;
            }
            s = s.next;
        }

        if(p != null) {
            s.next = p;
        }
        if(q != null) {
            s.next = q;
        }
        return s;
    }

}

 class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
 }
