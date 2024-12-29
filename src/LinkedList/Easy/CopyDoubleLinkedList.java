package LinkedList.Easy;

import LinkedList.DoubleLinkedList;
import LinkedList.DoublyListNode;

public class CopyDoubleLinkedList {
    public static DoublyListNode deepCopy(DoublyListNode head, DoublyListNode prev) {
        if (head == null) {
            return null;
        }
        DoublyListNode newNode = new DoublyListNode(head.val);
        if (prev != null)
            newNode.prev = prev;
        newNode.next = deepCopy(head.next, newNode);
        return newNode;
    }

    public static DoublyListNode deepCopy(DoublyListNode head) {
        return deepCopy(head, null);
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addEnd(1);
        list.addEnd(3);
        list.addEnd(0);
        list.addEnd(8);
        list.printDoubleLinkedList();
        DoublyListNode newHead = deepCopy(list.head);
        DoubleLinkedList.print(newHead);
    }
}
