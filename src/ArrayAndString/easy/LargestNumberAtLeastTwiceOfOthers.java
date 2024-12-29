package ArrayAndString.easy;

public class LargestNumberAtLeastTwiceOfOthers {
    public static int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = 0;
        int maxIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                maxIndex = i;
            }else if (secondMax > nums[i]){
                secondMax = nums[i];
            }
        }
        return maxIndex >= secondMax * 2 ? maxIndex : -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0};
        System.out.println(Integer.MIN_VALUE * 2);
    }
}
