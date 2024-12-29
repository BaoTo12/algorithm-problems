package ArrayAndString.easy;

public class PermutationOfString {
    static void permutation(String str) {
        permutation(str, "");
    }

    static void permutation(String str, String prefix) {
        int n = str.length();
        if (n == 0)
            System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutation(str);
    }
}
