package arraysAndStrings;

public class PalindromePermutation {

    public static void main(String[] args) {

    }

    static boolean isPalindrome(String str) {
        int[] char_nums = new int[26];
        for (int i = 0; i < str.length(); i++)
            char_nums[str.charAt(i) - 'a']++;

        boolean foundOdd = false;
        for (int i = 0; i < char_nums.length; i++) {
            if (char_nums[i] % 2 == 1) {
                if (foundOdd) return false;

                foundOdd = true;
            }
        }

        return true;
    }
}
