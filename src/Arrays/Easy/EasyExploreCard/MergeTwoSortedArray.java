package Arrays.Easy.EasyExploreCard;

import java.util.Arrays;

public class MergeTwoSortedArray {
    //    approach 1
    public static void mergeArrays(int[] ar1, int[] ar2, int[] ar3) {
        int i = 0, j = 0, k = 0;
        while (i < ar1.length && j < ar2.length) {
            if (ar1[i] > ar2[j]) {
                ar3[k++] = ar2[j++];
            } else {
                ar3[k++] = ar1[i++];
            }
            k++;
        }
        while (i < ar1.length) {
            ar3[k++] = ar1[i++];
        }
        while (j < ar2.length) {
            ar3[k++] = ar2[j++];
        }
    }
//    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//    Output: [1,2,2,3,5,6]
//    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

//    Input: nums1 = [1], m = 1, nums2 = [], n = 0
//    Output: [1]
//    Explanation: The arrays we are merging are [1] and [].
//    The result of the merge is [1].

    //    Input: nums1 = [0], m = 0, nums2 = [1], n = 1
//    Output: [1]
//    Explanation: The arrays we are merging are [] and [1].
//    The result of the merge is [1].
//    Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int[] ar1 = {1,2,3,0,0,0};
//        int[] ar2 = {2,5,6};
        // n = 3, m = 3
        int i = m - 1, j = n - 1, length = n + m - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[length--] = nums1[i--];
            } else {
                nums1[length--] = nums2[j--];
            }
        }
        while (i >= 0) {
            nums1[length--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[length--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] ar1 = {0};
        int[] ar2 = {1};
        merge(ar1, 0, ar2, 1);
        System.out.println(Arrays.toString(ar1));
    }
}
