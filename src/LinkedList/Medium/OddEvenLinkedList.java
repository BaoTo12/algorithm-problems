package LinkedList.Medium;


public class OddEvenLinkedList {
    //    Given the head of a singly linked list, group all the nodes with odd indices together followed
//    by the nodes with even indices, and return the reordered list.
//
//    The first node is considered odd, and the second node is even, and so on.
//
//    Note that the relative order inside both the even and odd groups should remain as it was in the input.
//
//    You must solve the problem in O(1) extra space complexity and O(n) time complexity.
//    Input: head = [1,2,3,4,5]
//    Output: [1,3,5,2,4]
//    Input: head = [2,1,3,5,6,4,7]
//    Output: [2,3,6,7,1,5,4]

    // approach 1
    public static ListNode oddEvenList(ListNode head) {
        int count = 1, length = 0;
        ListNode cur = head, prev = null;
        ListNode tail = head;
        if (head == null)
            return null;
        length += 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        while (cur != null && count <= length) {
            if (prev != null && count % 2 == 0) {
                tail.next = cur;
                tail = cur;
                // get the even index node
                prev.next = prev.next.next;
                cur = cur.next;
                // delete pointer to that node
                tail.next = null;
            } else {
                prev = cur;
                cur = cur.next;
            }
            count++;
        }
        return head;
    }

    // approach 2
    public static ListNode oddEvenList2(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode a = head;
        ListNode b = head.next, c = b;
        while (b != null && b.next != null) {
            a.next = b.next;
            a = a.next;
            b.next = a.next;
            b = b.next;
        }
        a.next = c;
        return head;
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.display();
        list.head = oddEvenList2(list.head);
        list.display();
    }
}
