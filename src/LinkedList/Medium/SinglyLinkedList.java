package LinkedList.Medium;

public class SinglyLinkedList {
    public ListNode head = null;
    public ListNode tail = null;

    //addNode() will add a new node to the list
    public void addNode(int data) {
        //Create a new node
        ListNode newNode = new ListNode(data);

        //Checks if the list is empty
        if (head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }
    public void addNode(ListNode newNode) {
        //Create a new node

        //Checks if the list is empty
        if (head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }

    //display() will display all the nodes present in the list
    public void display() {
        //Node current will point to head
        ListNode current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void display(ListNode head) {
        //Node current will point to head
        ListNode current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}