package Arrays.Easy.EasyExploreCard;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZeros {
//    Approach 1
    static void operate(int[] arr) {
        int po_dup = 0;
        int length = arr.length - 1;
        for (int i = 0; i <= length - po_dup; i++) {
            if (arr[i] == 0) {
                if (i == length - po_dup) {
                    //Input: arr = [1,0,2,3,0,0,  5,  0]
                    arr[length] = 0;
                    length--;
                    break;
                }
                po_dup++;
            }
        }
        int last = length - po_dup;
        // copy
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + po_dup] = 0;
                po_dup--;
                arr[i + po_dup] = 0;
            } else {
                arr[i + po_dup] = arr[i];
            }
        }
    }
    //    Approach 2
    static void operate2(int[] arr){
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
            if (arr[i] == 0)
                queue.offer(0);
            arr[i] = queue.poll();
        }
    }
    public static void main(String[] args) {
//        Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
//        Note that elements beyond the length of
//        the original array are not written. Do the above modifications to the input array in place and do not return anything.
//        Example 1:
//        Input: arr = [1,0,2,3,0,4,5,0]
//        Output: [1,0,0,2,3,0,0,4]
//        Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
//        Example 2:
//        Input: arr = [1,2,3]
//        Output: [1,2,3]
//        Explanation: After calling your function, the input array is modified to: [1,2,3]
//        Constraints:
//        1 <= arr.length <= 104
//        0 <= arr[i] <= 9
        /* Algorithm
        * 1. Find the number of zeros which would be duplicated. Let's call it possible_dups.
        * We do need to make sure we are not counting the zeros which would be trimmed off.
        * Since, the discarded zeros won't be part of the final array.
        * The count of possible_dups would give us the number of elements to be trimmed off the original array.
        * Hence at any point, length_ - possible_dups is the number of elements which would be included in the
        *
        * 2. Handle the edge case for a zero present on the boundary of the leftover elements.

        Let's talk about the edge case of this problem. We need to be extra careful when we are duplicating the zeros in the leftover array.
        * This care should be taken for the zero which is lying on the boundary.
        * Since, this zero might be counted as with possible duplicates, or may be just got included in the left over when there was no space left to accommodate its duplicate.
        *  If it is part of the possible_dups we would want to duplicate it otherwise we don't.

        An example of the edge case is - [8,4,5,0,0,0,0,7].
        In this array there is space to accommodate the duplicates of first and second occurrences of zero.
        * But we don't have enough space for the duplicate of the third occurrence of zero.
        Hence when we are copying we need to make sure for the third occurrence we don't copy twice. Result = [8,4,5,0,0,0,0,0]

        3. Iterate the array from the end and copy a non-zero element once and zero element twice.
        When we say we discard the extraneous elements, it simply means we start from the left of the extraneous elements and
        * start overwriting them with new values, eventually right shifting the left over elements and creating space for
        * all the duplicated elements in the array.
        *
        * */
        int[] arr = {1, 0, 2, 3, 0, 0, 5, 0};
        System.out.println("Array before operation: " + Arrays.toString(arr));
        operate2(arr);
        System.out.println("Array after operation: " + Arrays.toString(arr));
    }
}
