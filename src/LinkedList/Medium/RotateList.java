package LinkedList.Medium;

public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        tail.next = head;
        int t = (k + length) % length;
        for (; t < length; t++){
            tail = tail.next;
        }
        head = tail.next;
        tail.next = null;
        return head;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.display();
        ListNode newHead = rotateRight(list.head, 2);
        SinglyLinkedList.display(newHead);
    }
}
