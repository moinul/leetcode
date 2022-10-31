package org.moinul;

import org.moinul.helpermodel.ListNode;

public class RemoveDuplicatesFromSortedList implements MyRunner {
    @Override
    public void run() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        ListNode result = deleteDuplicates(head);
        System.out.print("New Link List: ");
        while (result != null) {
            System.out.print(result.val + ",");
            result = result.next;
        }
        System.out.println(" ");
    }

    private ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
