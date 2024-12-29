package ArrayAndString.easy;

import java.util.Arrays;

public class ArrayPartitionI {
    

    public static void merge(int[] arr, int low, int mid, int high) {
        int l = low;
        int r = mid + 1;
        int[] temp = new int[high - low + 1];
        int c = 0;
        while (l <= mid && r <= high) {
            if (arr[l] <= arr[r]) {
                temp[c++] = arr[l++];
            } else {
                temp[c++] = arr[r++];
            }
        }
        while (l <= mid) {
            temp[c++] = arr[l++];
        }
        while (r <= high) {
            temp[c++] = arr[r++];
        }
        for (int i = 0; i < temp.length; i++) {
            arr[low++] = temp[i];
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + ( high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    public static int arrayPairSum(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length - 1; i+= 2) {
            int min = Math.min(nums[i], nums[i + 1]);
            max+= min;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        mergeSort(arr, 0, arr.length - 1);
        int result = arrayPairSum(arr);
        System.out.println(result);

    }
}
