package arraysAndStrings;

import java.util.ArrayList;
import java.util.List;

public class URLify {

    public static void main(String[] args) {
        System.out.println(urlify("Mr Ibrahim     Ali    "));
    }


    static String urlify(String s) {

        List<Integer> indexes = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        String key = "%20";

        boolean start = false;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && start) {
                indexes.add(i);
                start = false;
            } else if (s.charAt(i) != ' ') start = true;
        }

        indexes.add(0);
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == indexes.get(index)){
                result.append(key);
                index++;
            }else if (s.charAt(i) != ' ') result.append(s.charAt(i));
        }
        return result.toString();
    }

}
