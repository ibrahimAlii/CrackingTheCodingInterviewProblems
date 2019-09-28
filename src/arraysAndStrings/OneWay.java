package arraysAndStrings;

public class OneWay {

    public static void main(String[] args) {
        System.out.println(isOneWay("pale", "ple"));
        System.out.println(isOneWay("pales", "pale"));
        System.out.println(isOneWay("pale", "bale"));
        System.out.println(isOneWay("apple", "aple"));
        System.out.println(isOneWay("pale", "bae"));
    }

    static boolean isOneWay(String str, String replacer){
        int[] char_nums_1 = new int[26];
        int[] char_nums_2 = new int[26];

        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char_nums_1[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < replacer.length(); i++) {
            char_nums_2[replacer.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            result += Math.abs(char_nums_1[i] - char_nums_2[i]);

            if (result > 2)
                return false;
        }

        return true;
    }
}
