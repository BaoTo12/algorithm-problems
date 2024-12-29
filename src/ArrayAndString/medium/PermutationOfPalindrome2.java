package ArrayAndString.medium;

public class PermutationOfPalindrome2 {
    static int getCharNumber(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z){
            return val - a;
        }
        return -1;
    }
    static boolean isPermutationOfPalindrome(String phrase){
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char x : phrase.toCharArray()){
            int c = getCharNumber(x);
            if (c != -1){
                table[c]++;
                if (table[c] % 2 == 1){
                    countOdd++;
                }else{
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }
}
