package LinkedList.Medium;

import LinkedList.DoubleLinkedList;
import LinkedList.DoublyListNode;

import java.util.HashMap;
import java.util.Map;

class NodeRandom {
    int val;
    NodeRandom next;
    NodeRandom random;

    public NodeRandom(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPointer {
    public static void printDoubleLinkedList(NodeRandom head) {
        NodeRandom current = head;
        while (current != null) {
            System.out.print(current.val + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static NodeRandom copyRandomList(NodeRandom head) {
        NodeRandom cur = head;
        Map<NodeRandom, NodeRandom> oldToCopy = new HashMap<>();
        while (cur != null) {
            NodeRandom newNode = new NodeRandom(cur.val);
            oldToCopy.put(cur, newNode);
            cur = cur.next;
        }
        cur = head;
        NodeRandom nodeRandom = null;
        while (cur != null) {
            nodeRandom = oldToCopy.get(cur);
            nodeRandom.next = oldToCopy.get(cur.next);
            nodeRandom.random = oldToCopy.get(cur.random);
            cur = cur.next;
        }
        return oldToCopy.get(head);
    }

    public static void main(String[] args) {
        NodeRandom head = new NodeRandom(7);
        NodeRandom node13 = new NodeRandom(13);
        NodeRandom node11 = new NodeRandom(11);
        NodeRandom node10 = new NodeRandom(10);
        NodeRandom node1 = new NodeRandom(1);

        head.next = node13;
        node13.next = node11;
        node11.next = node10;
        node10.next = node1;
        // random pointer
        head.random = null;
        node13.random = head;
        node11.random = node1;
        node10.random = node11;
        printDoubleLinkedList(head);
        NodeRandom newHead = copyRandomList(head);
        printDoubleLinkedList(newHead);
    }
}
