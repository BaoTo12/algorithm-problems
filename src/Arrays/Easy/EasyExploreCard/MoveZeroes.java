package Arrays.Easy.EasyExploreCard;

import java.util.Arrays;

public class MoveZeroes {
    static void move(int[] arr) {
        int countZero = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                arr[k++] = arr[i];
            if (arr[i] == 0)
                countZero++;
        }
        for (int i = arr.length - countZero; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
    public static void moveZeroes(int[] nums) {
        for (int i = 0, k = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                int t = nums[i];
                nums[i] = nums[k];
                nums[k] = t;
                k++;
            }
        }
    }
    public static void main(String[] args) {
//        Given an integer array nums, move all 0's to the end of it
//    while maintaining the relative order of the non-zero elements.
//        Note that you must do this in-place without making a copy of the array.
//        Example 1:
//
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//        Example 2:
//
//        Input: nums = [0]
//        Output: [0]
        int[] arr = {0, 1, 0, 3, 12};
//        Output: [1,3,12,0,0]
        System.out.println(Arrays.toString(arr));
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

}
