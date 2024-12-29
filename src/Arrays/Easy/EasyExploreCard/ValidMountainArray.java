package Arrays.Easy.EasyExploreCard;

public class ValidMountainArray {
    //    Given an array of integers arr, return true if and only if it is a valid mountain array.
//    Recall that arr is a mountain array if and only if:
//    arr.length >= 3
//    There exists some i with 0 < i < arr.length - 1 such that:
//    arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//    arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
//    Example 1:
//
//    Input: arr = [2,1]
//    Output: false
//    Example 2:
//
//    Input: arr = [3,5,5]
//    Output: false
//    Example 3:
//
//    Input: arr = [0,3,2,1]
//    Output: true
    static boolean check(int[] A) {
//        if (arr.length < 3)
//            return false;
//        int maxV = arr[0];
//        int maxI = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > maxV) {
//                maxV = arr[i];
//                maxI = i;
//            }
//        }
//        if (maxI == 0 || maxI == arr.length - 1)
//            return false;
//        int start = arr[0];
//        for (int j = 1; j <= maxI; j++) {
//            if (!(arr[j] > start))
//                return false;
//            else
//                start = arr[j];
//
//        }
//        for (int k = maxI + 1; k < arr.length; k++) {
//            if (!(arr[k] < maxV))
//                return false;
//            else
//                maxV = arr[k];
//        }
//        return true;
        int peak = 0;
        int valley = 0;

        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                peak++;
            }
            if (A[i - 1] >= A[i] && A[i] <= A[i + 1]) {
                valley++;
            }
        }
        return peak == 1 && valley == 0;
    }

    public static void main(String[] args) {
        int[] arr = {3, 10,2, 1, 0};
        System.out.println(check(arr));
    }
}
