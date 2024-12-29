package LinkedList.Medium;


public class RemoveNthNodeFromEndOfList {
    // approach 1
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head, prev = null;
        int size = 1;
        while (cur.next != null) {
            cur = cur.next;
            size++;
        }
        cur = head;
        int count = size - n;
        if (count >= 0) {
            while (count > 0) {
                prev = cur;
                cur = cur.next;
                count--;
            }
            prev.next = cur.next;
        }

        return head;
    }
    // approach2
    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        while (n-- > 0){
            fast = fast.next;
        }
        if (fast == null)
            return head.next;
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return  head;
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.display();
        removeNthFromEnd(list.head, 2);
        list.display();
    }
}
