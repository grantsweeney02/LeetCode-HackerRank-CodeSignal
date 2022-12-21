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
    public ListNode middleNode(ListNode head) {
        int num = 0;
        ListNode middle = head;
        while(head.next != null) {
            if(num%2 == 0) {
                middle = middle.next;
            }
            num++;
            head = head.next;
        }
        return middle;
    }
}