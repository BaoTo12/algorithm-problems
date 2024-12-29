package ArrayAndString.medium;

public class PermutationOfPalindrome1 {
    static boolean isPermutationOfPalindrome(String phrase){
        int[] table = buildCharFrequencyTable(phrase);
        return checkMaxOdd(table);
    }
    static boolean checkMaxOdd(int[] table){
        boolean foundOdd = false;
        for (int count : table){
            if (count % 2 == 1){
                if (foundOdd){
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }
    static int getCharNumber(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z){
            return val - a;
        }
        return -1;
    }

    static int[] buildCharFrequencyTable(String phrase){
        char[] str = phrase.toCharArray();
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (int i = 0; i < str.length; i++) {
            int c = getCharNumber(str[i]);
            if (c != -1){
                table[c]++;
            }
        }
        return table;
    }
    public static void main(String[] args) {
       String str = "aba";
        System.out.println(isPermutationOfPalindrome(str));
    }
}
