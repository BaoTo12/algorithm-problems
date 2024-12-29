package Arrays.Easy.EasyExploreCard;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SquareAndSort {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] sortSquares(int[] A) {


    return A;

    }

    public static void main(String[] args) {
//        Input: nums = [-4,-1,0,3,10]
//        Output: [0,1,9,16,100]
//        Explanation: After squaring, the array becomes [16,1,0,9,100].
//        After sorting, it becomes [0,1,9,16,100].
        int arr[] = {-4, -1, 0, 8, 10};
        int n = arr.length;

        System.out.println("Before sort ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        int[] result = sortSquares(arr);
        System.out.println();
        System.out.println("After Sort ");
        for (int i = 0; i < n; i++)
            System.out.print(result[i] + " ");
    }
}
