package ArrayAndString.easy;

import java.util.Arrays;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int right = Arrays.stream(nums).sum();
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            right -= nums[i];
            if (right == left)
                return i;
            left += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
    }
}
