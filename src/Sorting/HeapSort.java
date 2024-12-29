package Sorting;

public class HeapSort {
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void siftDown(int[] nums, int n, int i) {
        while (true) {
            int left = i * 2 + 1;
            int right = i * 2 + 2;
            int ma = i;
            if (left < n && nums[left] > nums[ma]) {
                ma = left;
            }
            if (right < n && nums[right] > nums[ma]) {
                ma = right;
            }
            if (ma == i)
                break;
            swap(nums, i, ma);
            i = ma;
        }
    }

    public static void heapSort(int[] nums) {
        int n = nums.length;
        // build max heap [6, 5, 12, 10, 9, 1]
        for (int i = (n - 1) / 2; i >= 0; i--) {
            siftDown(nums, n, i);
        }

        // after building [12, 10, 6, 5, 9, 1]
        for (int i = n - 1; i >= 0; i--) {
            swap(nums, 0, i);
            siftDown(nums, i, 0);
        }
        //after sorting [1, 5, 6, 9, 10, 12]
    }
}
