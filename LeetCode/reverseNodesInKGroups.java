/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int size(ListNode head)
    {
        int n = 0;
        while(head != null)
        {
            head = head.next;
            n++;
        }
        return n;
    }
    public ListNode reverse(ListNode head,int k)
    {
        ListNode curr = head;
        ListNode prev = null;
        ListNode temp = curr;
        int count = 0;

        while(curr != null && count<k)
        {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            count++;
        }
        if(temp != null)
        {
            head.next = reverse(temp, k);
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k)
    {
        int n = size(head);
        ListNode newHead = reverse(head,k);
        if(n%k == 0 || n%k==1)
            return newHead;
        else
        {
            ListNode temp = newHead;
            int newVal = n/k;
            newVal *= k;
            ListNode prev = null;
            for(int i=0;i<newVal;i++)
            {
                prev = temp;
                temp = temp.next;
            }
                
            
            ListNode nxt = null,last=null;
            while(temp!=null)
            {
                nxt = temp.next;
                temp.next = last;
                last = temp;
                temp = nxt;
            }
            prev.next = last;
        }
        return newHead;
    }
}
