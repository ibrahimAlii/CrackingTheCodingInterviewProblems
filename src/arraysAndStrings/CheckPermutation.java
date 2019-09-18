package arraysAndStrings;

public class CheckPermutation {

    public static void main(String[] args) {
        System.out.println(isPermutation("abcd", "dbca"));
    }

    static boolean isPermutation(String s, String t){
        if (s.length() != t.length()) return false;

        int[] char_arr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char_arr[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++) {
            char_arr[t.charAt(i)]--;
            if (char_arr[t.charAt(i)] < 0) return false;
        }

        return true;
    }
}
