package LinkedList.Easy;

public class PalindromeLinkedList {
    //    Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
//    Input: head = [1,2,2,1]
//    Output: true
//    Input: head = [1,2]
//    Output: false
//    Follow up: Could you do it in O(n) time and O(1) space?
    public static boolean isPalindrome(ListNode head) {
        // step find middle of linked list
        // if linked list is odd --> reverse the node after slow
        // if the linked is even --> reverse the slow node

        // find the middle of linked list
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            // case 1: if the node is even fast = null (stop case) is null
            // case 2: if the node is odd fast.next (stop case) is null
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        slow = reverseList(slow);
        while (slow != null) {
            if (slow.val != head.val) {
                return false;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;
    }

    public static ListNode reverseList(ListNode head) {
         // 2  1 -> 0
        ListNode prev = null;
        while (head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(2);
        list.addNode(1);
        System.out.println(isPalindrome(list.head));
    }
}
