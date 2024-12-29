package LinkedList.Easy;

public class LinkedListCycleI {
    public static boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        if (head.next == null)
            return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null){
            if (slow == fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        // 3,1,0,-4

    }
}
