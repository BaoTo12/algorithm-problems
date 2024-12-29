package Arrays.Easy.EasyExploreCard;

import Sorting.MergeSort;

import java.util.*;

public class ThirdMaximumNumber {
    //    Given an integer array nums, return the third distinct maximum number in this array.
//    If the third maximum does not exist, return the maximum number.
//
//    Example 1:
//    Input: nums = [3,2,1]
//    Output: 1
//    Explanation:
//    The first distinct maximum is 3.
//    The second distinct maximum is 2.
//    The third distinct maximum is 1.
//    Example 2:
//
//    Input: nums = [1,2]
//    Output: 2
//    Explanation:
//    The first distinct maximum is 2.
//    The second distinct maximum is 1.
//    The third distinct maximum does not exist, so the maximum (2) is returned instead.
//    Example 3:
//
//    Input: nums = [2,2,3,1]
//    Output: 1
//    Explanation:
//    The first distinct maximum is 3.
//    The second distinct maximum is 2 (both 2's are counted together since they have the same value).
//    The third distinct maximum is 1.
    //Approach 1: Sorting
    public static int thirdMax(int[] nums) {
        // Sort the array in non-increasing order.
//        Arrays.sort(nums);
        MergeSort.mergeSort(nums, 0 , nums.length - 1);
        // Reverse array to make it non-increasing.
//        for (int index = 0; index < nums.length / 2; ++index) {
//            int temp = nums[index];
//            nums[index] = nums[nums.length - 1 - index];
//            nums[nums.length - 1 - index] = temp;
//        }

        int elemCounted = 1;
        int prevElem = nums[0];

        for (int index = 1; index < nums.length; ++index) {
            // Current element is different from previous.
            if (nums[index] != prevElem) {
                elemCounted += 1;
                prevElem = nums[index];
            }

            // If we have counted 3 numbers then return current number.
            if (elemCounted == 3) {
                return nums[index];
            }
        }

        // We never counted 3 distinct numbers, return largest number.
        return nums[0];
    }
    // approach 2
    public static int thirdMax2(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Set<Integer> taken = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (taken.contains(nums[i]))
                continue;
            if (queue.size() == 3){
                if (queue.peek() < nums[i]){
                    taken.remove(queue.poll());
                    queue.add(nums[i]);
                    taken.add(nums[i]);
                }
            }else {
                queue.add(nums[i]);
                taken.add(nums[i]);
            }
        }
        if (queue.size() == 1){
            return queue.peek();
        }else if (queue.size() == 2){
            queue.poll();
            return queue.peek();
        }
        return queue.peek();
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        System.out.println(thirdMax2(arr));
    }
}
