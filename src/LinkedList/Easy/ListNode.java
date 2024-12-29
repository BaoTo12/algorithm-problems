package LinkedList.Easy;

public class ListNode {
     public int val;
    public ListNode next;

    public ListNode(int data) {
        this.val = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "data=" + val +
                '}';
    }
}