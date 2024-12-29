package Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] nums){
        int maxV = Arrays.stream(nums).max().getAsInt();
        int[] counter = new int[maxV + 1];
        for (int i = 0; i < nums.length; i++) {
            counter[nums[i]]++;
        }
        int k = 0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0){
                while (counter[i] > 0){
                    nums[k++] = i;
                    counter[i]--;
                }
            }
        }
    }
}
