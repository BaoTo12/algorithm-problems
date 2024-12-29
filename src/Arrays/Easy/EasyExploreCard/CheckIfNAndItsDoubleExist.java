package Arrays.Easy.EasyExploreCard;

import java.util.Arrays;

public class CheckIfNAndItsDoubleExist {
    //        Given an array arr of integers, check if there exist two indices i and j such that :
//        i != j
//        0 <= i, j < arr.length
//        arr[i] == 2 * arr[j]
//        Input: arr = [2,10,5,3]
    static boolean check(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int j = arr.length - 1;
            while (i != j) {
                if (arr[i] == arr[j] * 2 || arr[i] * 2 == arr[j]) {
                    return true;
                }
                j--;
            }
            i++;
        }
        return false;
    }
    public static boolean checkIfExist(int[] arr) {
        if (arr == null || arr.length < 2) {
            return false;
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int currentValue = arr[i];
            int idx = Arrays.binarySearch(arr, currentValue * 2);
            if (idx >= 0 && idx != i) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

//        Example 1:
//        Input: arr = [10,2,5,3]
//        Output: true
//        Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
//        Example 2:
//        Input: arr = [3,1,7,11]
//        Output: false
//        Explanation: There is no i and j that satisfy the conditions.
        int[] arr = {10,2,5,3};
        System.out.println(check(arr));
    }
}
