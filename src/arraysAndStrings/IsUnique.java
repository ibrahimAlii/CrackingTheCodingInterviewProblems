package arraysAndStrings;

/**
 * Implement an algorithm to determine if a string has all unique characters. what if you cannot use additional
 * data structure ?
 */
public class IsUnique {


    public static void main(String[] args) {
        System.out.println(isUnique("abcdefghijklmnopqrstuvwxyz0123456789.+-*/<>?|~!@#$%^&()_:;][{}"));
    }

    public static boolean isUnique(String str) {
        if (str.length() > 128)
            return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val])
                return false;

            char_set[val] = true;
        }

        return true;
    }
}
