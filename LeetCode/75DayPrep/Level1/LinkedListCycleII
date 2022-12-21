/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, ListNode> map = new HashMap<>();
        if(head == null) {
            return null;
        }
        while(head.next != null) {
            if(map.containsKey(head.next)) {
                return head.next;
            }
            else {
                map.put(head, head.next);
            }
            head = head.next;
        }
        return null;
    }
}