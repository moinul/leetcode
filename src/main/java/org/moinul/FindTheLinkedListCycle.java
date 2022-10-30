package org.moinul;

import org.moinul.helpermodel.*;
import org.omg.PortableServer.ServantRetentionPolicy;

import javax.swing.plaf.nimbus.AbstractRegionPainter;

public class FindTheLinkedListCycle implements MyRunner {
    @Override
    public void run() {
//        ListNode head = new ListNode();
//        System.out.println("Has Cycle : " + hasCycle(head));
    }

    private boolean hasCycle(ListNode head) {
        boolean isCycle = false;
        if (head != null) {
            ListNode pNode = head;
            ListNode fNode = head;
            while (fNode != null && fNode.next != null) {
                pNode = pNode.next;
                fNode = fNode.next.next;
                if (pNode == fNode) {
                    isCycle = true;
                    break;
                }
            }
        }
        return isCycle;
    }
}
