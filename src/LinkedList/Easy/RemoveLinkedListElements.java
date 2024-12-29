package LinkedList.Easy;

public class RemoveLinkedListElements {
    //    Input: head = [1,2,6,3,4,5,6], val = 6
//    Output: [1,2,3,4,5]
//    Input: head = [], val = 1
//    Output: []
//    Input: head = [7,7,7,7], val = 7
//    Output: []
    public static ListNode removeElements(ListNode head, int val) {

        if (head == null)
            return null;
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode cur = head, prev = null;
        while (cur != null) {
            if (prev != null && cur.val == val) {
                prev.next = prev.next.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(6);
        list.addNode(2);
        list.addNode(6);
        list.addNode(6);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.display();
        list.head = removeElements(list.head, 6);
        list.display();
    }
}
