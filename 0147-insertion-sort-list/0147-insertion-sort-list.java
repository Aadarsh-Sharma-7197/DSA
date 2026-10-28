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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = head;
        while(head != null){
            curr = head;
            head = head.next;
            ListNode p = dummy;
            while(p.next != null && p.next.val < curr.val)
                p = p.next;
            curr.next = p.next;
            p.next = curr;
        }
        return dummy.next;
    }
}