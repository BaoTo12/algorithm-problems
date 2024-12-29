package ArrayAndString.easy;

public class TwoStringAreOneOrZeroEdits {
//    One Away: There are three types of edits that can be performed on strings:
//    insert a character, remove a character, or replace a character.
//    Given two strings, write a function to check if they are one edit (or zero edits) away.
//    EXAMPLE
//    pale, ple -> true
//    pales, pale -> true
//    pale, bale -> true
//    pale, bake -> false

    static boolean check(String first, String second) {
        if (first.length() == second.length()) {
            return oneEditReplace(first, second);
        } else if (first.length() + 1 == second.length()) {
            return oneEditInsert(first, second);
        } else if (first.length() - 1 == second.length()) {
            return oneEditInsert(second, first);
        }
        return true;
    }

    static boolean oneEditReplace(String s1, String s2) {
        boolean foundDiff = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)){
                if (foundDiff)
                    return false;
                foundDiff = true;
            }
        }
        return true;
    }

    // Check if you can insert a character into s1 to make s2.
    static boolean oneEditInsert(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        while (index1 < s1.length() && index2 < s2.length()){
            if (s1.charAt(index1) != s2.charAt(index2)){
                if (index1 != index2)
                    return false;
            }else {
                index1++;
            }
            index2++;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "aple";
        System.out.println(check(s1, s2));
    }
}
