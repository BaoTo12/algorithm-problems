package LinkedList.Easy;

public class CopySinglyLinkedList {
    public static ListNode deepCopy(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode newNode = new ListNode(head.val);
        newNode.next = deepCopy(head.next);
        return newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.display();
        ListNode newList = deepCopy(deepCopy(list.head));
        SinglyLinkedList.display(newList);
    }
}
