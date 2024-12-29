package LinkedList.Easy;

import javax.security.auth.login.CredentialNotFoundException;

public class ReverseLinkedList {
    // approach 1
    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null){
            return head;
        }
        ListNode cur = head, next = null, oldHead = null;
        while (cur.next != null){
            next = cur.next;
            oldHead = head;
            cur.next = next.next;
            head = next;
            head.next = oldHead;
        }

        return head;
    }
    //approach 2
    static ListNode reverseList2(ListNode head) {
        // if list is empty or the end of the list
        if (head == null || head.next == null){
            return head;
        }
        // to get the last node of the like --> this is new head
        ListNode rest = reverseList2(head.next);
        // to reverse A -> B to B -> A
        head.next.next = head;
        head.next = null;

        return rest;
    }
    //    Input: head = [1,2,3,4,5]
//    Output: [5,4,3,2,1]
//    Input: head = []
//    Output: []
//    Input: head = [1,2]
//    Output: [2,1]
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.display();
        list.head= reverseList2(list.head);
        list.display();
    }
}
