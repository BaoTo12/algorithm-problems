package Arrays.Easy.EasyExploreCard;

public class NumberOfEvenDigits {
    public static int count(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int countN = 0;
            do {
                countN++;
                num  = num / 10;
            }while (num > 0);
            if (countN % 2 == 0) count++;
        }
        return count;
    }
    public static void main(String[] args) {
//        Input: nums = [12,345,2,6,7896]
//        Output: 2
//        Input: nums = [555,901,482,1771]
//        Output: 1
        int[] nums = {555,901,482,1771};
        System.out.println(count(nums));
    }
}
