package Sorting;

public class MergeSort {
    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k =0;
        while (i <= mid && j <= high){
            if (arr[i] < arr[j]){
                temp[k++] = arr[j++];
            }else {
                temp[k++] = arr[i++];
            }
        }
        while (i <= mid){
            temp[k++] = arr[i++];
        }
        while (j <= high){
            temp[k++] = arr[j++];
        }
        k = 0;
        for (int l = 0; l < temp.length; l++) {
            arr[low + l] = temp[l];
        }
    }
    public  static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);
            merge(arr, low, middle, high);
        }
    }
}
