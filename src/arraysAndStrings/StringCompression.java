package arraysAndStrings;

public class StringCompression {

    public static void main(String[] args) {
        System.out.println(compressString("aabcccccaaa"));
    }

    static String compressString(String str){
        StringBuilder compressed = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int consecutive = 0;
            char current = str.charAt(i);
            compressed.append(current);
            while (i < str.length() && current == str.charAt(i)){
                consecutive++;
                i++;
            }
            compressed.append(consecutive);
            i--;
        }

        return compressed.toString();
    }
}
