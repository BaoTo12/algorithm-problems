package LinkedList.Easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoLinkedLists {
    // approach 1
//    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        ListNode curA = headA;
//        ListNode curB ;
//        while (curA != null ){
//            curB = headB;
//            while (curB != null){
//                if (curA == curB){
//                    return curA;
//                }
//                curB = curB.next;
//            }
//            curA = curA.next;
//        }
//        return null;
//    }
//    approach 2
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }

    public static void main(String[] args) {
//        Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
//        Output: Intersected at '8'
//        Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
//        From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes
//        before the intersected node in A; There are 3 nodes before the intersected node in B.
//                - Note that the intersected node's value is not 1 because the nodes with value 1 in A and B
//    (2nd node in A and 3rd node in B) are different node references. In other words, they point to two different locations
//        in memory,
//    while the nodes with value 8 in A and B (3rd node in A and 4th node in B) point to the same location in memory.
        SinglyLinkedList listA = new SinglyLinkedList();
        listA.addNode(1);
        listA.addNode(9);
        listA.addNode(1);
        listA.addNode(2);
        listA.addNode(4);
        listA.addNode(5);

        // Create second linked list
        SinglyLinkedList listB = new SinglyLinkedList();
        listB.addNode(3);
        listB.addNode(5);
        listB.addNode(10);

//        ListNode intersectingNode = new ListNode(2);
//        intersectingNode.next = new ListNode(4);
//        listA.addNode(intersectingNode);
//        listB.addNode(intersectingNode);
        System.out.println(getIntersectionNode(listA.head, listB.head));

    }
}
