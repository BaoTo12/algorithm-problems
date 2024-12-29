package LinkedList.Easy;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleII {
    //    Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
//
//    There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
//    following the next pointer. Internally, pos is used to denote the index of the node that
//    tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
//
//    Do not modify the linked list.
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visitedListNode = new HashSet<>();
        ListNode cur = head;
        while (cur != null){
            if (cur.next != null && visitedListNode.contains(cur.next)){
                return cur.next;
            }
            visitedListNode.add(cur);
            cur = cur.next;
        }
        return null;
    }
    public ListNode detectCycle2(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        LinkedListCycleII test = new LinkedListCycleII();
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(10);
        ListNode node = new ListNode(1);
        list.addNode(node);
        ListNode node9 = new ListNode(9);
        list.addNode(node9);
        list.addNode(4);
        list.addNode(3);
        ListNode node5 = new ListNode(5);
        node5.next = node9;
        list.addNode(node5);

       System.out.println(test.detectCycle2(list.head));
    }
}
