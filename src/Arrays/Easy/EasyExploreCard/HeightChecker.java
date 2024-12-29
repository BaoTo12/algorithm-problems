package Arrays.Easy.EasyExploreCard;

import java.util.Arrays;

import Sorting.*;

public class HeightChecker {
    //    A school is trying to take an annual photo of all the students.
//    The students are asked to stand in a single file line in non-decreasing order by height.
//    Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith
//    student in line.
//    You are given an integer array heights representing the current order that the students are standing in. E
//    ach heights[i] is the height of the ith student in line (0-indexed).
//    Return the number of indices where heights[i] != expected[i].
//
//    Example 1:
//
//    Input: heights = [1,1,4,2,1,3]
//    Output: 3
//    Explanation:
//    heights:  [1,1,4,2,1,3]
//    expected: [1,1,1,2,3,4]
//    Indices 2, 4, and 5 do not match.
//    Example 2:
//
//    Input: heights = [5,1,2,3,4]
//    Output: 5
//    Explanation:
//    heights:  [5,1,2,3,4]
//    expected: [1,2,3,4,5]
//    All indices do not match.
//    Example 3:
//
//    Input: heights = [1,2,3,4,5]
//    Output: 0
//    Explanation:
//    heights:  [1,2,3,4,5]
//    expected: [1,2,3,4,5]
//    All indices match.
    static int heightChecker(int[] heights, int[] tempArr) {
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != tempArr[i]) {
                count++;
            }
        }
        return count;
    }


    // Function to max heapify a subtree (in top-down order) rooted at index i.


    public static void main(String[] args) {
//        1,1,4,2,1,3 -> 3
//        5,1,2,3,4 -> 5
//        1,2,3,4,5 -> 0
        int[] arr = {6, 5, 12, 10, 9, 1};
        int[] tempArr = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(tempArr));
//        MergeSort.mergeSort(tempArr, 0, tempArr.length - 1);
        CountingSort.countingSort(tempArr);
        System.out.println(Arrays.toString(tempArr));
        System.out.println(heightChecker(arr, tempArr));

    }
}
