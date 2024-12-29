package LinkedList.Medium;


class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node(int val) {
        this.val = val;
    }

    public Node() {
    }

    public Node(Node prev) {
        this.prev = prev;
    }

    public Node(int val, Node prev) {
        this.val = val;
        this.prev = prev;
    }

    public Node(Node prev, Node next) {
        this.prev = prev;
        this.next = next;
    }


}

public class FlattenMultilevelDoublyLinkedList {
    //    Approach 1: Recursive
    public static Node flatten(Node head) {
        return flatten(head, null);
    }

    private static Node flatten(Node head, Node rest) {
        if (head == null)
            return rest;

        head.next = flatten(head.child, flatten(head.next, rest));
        if (head.next != null)
            head.next.prev = head;
        head.child = null;
        return head;
    }
//    Approach 2: Iterative
//    public static Node flatten(Node head) {
//        for (Node curr = head; curr != null; curr = curr.next)
//            if (curr.child != null) {
//                Node cachedNext = curr.next;
//                curr.next = curr.child;
//                curr.child.prev = curr;
//                curr.child = null;
//                Node tail = curr.next;
//                while (tail.next != null)
//                    tail = tail.next;
//                tail.next = cachedNext;
//                if (cachedNext != null)
//                    cachedNext.prev = tail;
//            }
//
//        return head;
//    }

    public static void printList(Node head) {
        printListHelper(head, 0);
    }

    private static void printListHelper(Node node, int level) {
        while (node != null) {
            // Print the value of the current node
            System.out.print("L" + level + ": " + node.val + " ");

            // If the current node has a child, print the child list
            if (node.child != null) {
                printListHelper(node.child, level + 1);
            }

            // Move to the next node in the list
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1, null);
        Node node2 = new Node(2, head);
        head.next = node2;
        Node node3 = new Node(3, node2);
        node2.next = node3;
        Node node4 = new Node(4, node3);
        node3.next = node4;

        Node node3Child5 = new Node(5, null);
        node3.child = node3Child5;
        Node node6 = new Node(6, node3Child5);
        node3Child5.next = node6;
        Node node7 = new Node(7, node6);
        node6.next = node7;

        Node node6Child8 = new Node(8, null);
        node6.child = node6Child8;

        Node node9 = new Node(9, node6Child8);
        node6Child8.next = node9;

        Node node9Child10 = new Node(10, null);
        node9.child = node9Child10;

        printList(head);
        flatten(head);
        System.out.println();
        printList(head);
    }
}
