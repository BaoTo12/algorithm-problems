package Arrays.Easy.EasyExploreCard;

import java.util.Arrays;

public class RemoveElement {
    //    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
//    The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//    Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
//    Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
//    The remaining elements of nums are not important as well as the size of nums.
//    Return k.
//    Example 1:
//
//    Input: nums = [3,2,2,3], val = 3
//    Output: 2, nums = [2,2,_,_]
//    Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//    It does not matter what you leave beyond the returned k (hence they are underscores).
//    Example 2:
//
//    Input: nums = [0,1,2,2,3,0,4,2], val = 2
//    Output: 5, nums = [0,1,4,0,3,_,_,_]
//    Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
//    Note that the five elements can be returned in any order.
//    It does not matter what you leave beyond the returned k (hence they are underscores).
//    public static int removeElement(int[] nums, int val) {
//        int j = nums.length - 1;
//        int count = 0;
//        while (nums[j] == val) {
//            j--;
//            count++;
//        }
//        for (int i = 0; i < nums.length - count; i++) {
//            if (nums[i] == val) {
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//                count++;
//                j--;
//            }
//        }
//        return j + 1;
//    }
    public static int removeElement2(int[] nums, int val) {
        int k = 0; // Pointer for the position of elements not equal to val

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Place the non-val element at position k
                k++; // Increment k
            }
        }

        return k; // Return the number of elements not equal to val
    }
    // start & end will be like index in array
    public static void sort(int[] nums, int start, int end) {
        for (int i = start; i <= end; i++) {
            for (int j = 0; j < end; j++) {
                if (nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 1, 4, 3};
        int val = 3;
        int k = removeElement2(nums, val);
        System.out.println(Arrays.toString(nums));
        sort(nums, 0, k - 1);
        System.out.println(Arrays.toString(nums));
        System.out.println(k);
    }
}
