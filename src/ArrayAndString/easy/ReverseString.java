package ArrayAndString.easy;

import java.util.Arrays;

public class ReverseString {
    public static void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j){
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }
    }

    public static void main(String[] args) {
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(Arrays.toString(str));
        reverseString(str);
        System.out.println(Arrays.toString(str));
    }
}
