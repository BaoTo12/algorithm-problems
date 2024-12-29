package ArrayAndString.easy;

import java.util.HashSet;
import java.util.Set;

public class OneStringHasAnotherStringPermutation {
    // approach 1
    static boolean check(String str1, String str2){
        Set<String> strings = new HashSet<>();
        permutation(str1, "", strings);
        return strings.contains(str2);
    }
    static void permutation(String str, String prefix, Set<String> strings){
        if (str.length() == 0){
            strings.add(prefix);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            String rem = str.substring(0, i) + str.substring(i + 1, str.length());
            permutation(rem, prefix + str.charAt(i), strings);
        }
    }
    // approach 2
    static boolean permutation(String s1, String s2){
        if (s1.length() != s2.length())
            return false;
        // assume all characters in two strings are ASCII code
        int[] letters = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            int c = (int) s1.charAt(i);
            letters[c]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            int c = (int) s1.charAt(i);
            letters[c]--;
            if (letters[c] < 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "bac";
        System.out.println(permutation(str1, str2));
    }
}
