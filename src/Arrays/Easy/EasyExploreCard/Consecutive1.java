package Arrays.Easy.EasyExploreCard;

public class Consecutive1 {
    public static int count(int[] arr) {
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                count++;
                count1 = Math.max(count, count1);
            }else {
                count = 0;
            }
        }
        return count1;
    }

    public static void main(String[] args) {
//        Input: nums = [1,1,0,1,1,1]
//        Output: 3
//        Explanation: The first two digits or the last three digits are consecutive 1s.
//            The maximum number of consecutive 1s is 3.
//        Input: nums = [1,0,1,1,0,1]
//        Output: 2
        int[] nums = {1,1,0,1,1,1};
        System.out.println(count(nums));
    }
}
