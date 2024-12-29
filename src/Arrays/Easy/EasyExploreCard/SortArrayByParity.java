package Arrays.Easy.EasyExploreCard;

import java.util.Arrays;

public class SortArrayByParity {
    //    Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
//    Return any array that satisfies this condition.
//    Example 1:
//
//    Input: nums = [3,1,2,4]
//    Output: [2,4,3,1]
//    Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
//    Example 2:
//
//    Input: nums = [0]
//    Output: [0]
    static void move(int[] nums) {
        int k = 0, temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        System.out.println(Arrays.toString(nums));
        move(nums);
        System.out.println(Arrays.toString(nums));
    }
}
