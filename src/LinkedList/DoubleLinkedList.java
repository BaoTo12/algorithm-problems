package LinkedList;

public class DoubleLinkedList {
    public DoublyListNode head;
    public DoubleLinkedList(DoublyListNode head) {
        this.head = head;
    }

    public DoubleLinkedList() {
    }

    // Add a node to the front of the list
    public void addFront(int value) {
        DoublyListNode newNode = new DoublyListNode(value);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    // Add a node to the end of the list
    public void addEnd(int value) {
        DoublyListNode newNode = new DoublyListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        DoublyListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    // Remove a node by value
    public boolean remove(int value) {
        DoublyListNode current = head;
        while (current != null) {
            if (current.val == value) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next; // Update head if the node to remove is the first node
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                return true; // Node found and removed
            }
            current = current.next;
        }
        return false; // Node not found
    }

    // Search for a node by value
    public boolean search(int value) {
        DoublyListNode current = head;
        while (current != null) {
            if (current.val == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Print the double linked list (instance method)
    public void printDoubleLinkedList() {
        DoublyListNode current = head;
        while (current != null) {
            System.out.print(current.val + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Static method to print a double linked list from a given head node
    public static void print(DoublyListNode head) {
        DoublyListNode current = head;
        while (current != null) {
            System.out.print(current.val + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
