package ArrayAndString.easy;

public class HasAllUniqueCharacters {
    static boolean isUnique(String str) {

        System.out.println(str);
        for (int i = 0; i < str.length() - 1; i++) {
            System.out.println((int) str.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abcda";
        System.out.println(isUnique(str));
    }
}
