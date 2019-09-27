import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(solution(new int[]{1, 4, -1, 3, 2}));
        System.out.println(1224 % 26);

        String chars = "abcdefghijklmnopqrstuvwxyz";
        String str = "abcd00hdjhs1224";
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < str.length()) {
            StringBuilder number = new StringBuilder();
            int charIndex = -1;
            while (index < str.length() && Character.isDigit(str.charAt(index))) {
                number.append(str.charAt(index));
                index++;
            }

            if (!number.toString().isEmpty()){
                charIndex =  Integer.parseInt(number.toString()) % 26;
            }

            if (charIndex != -1){
                result.append(chars.charAt(charIndex));
            }
            index++;
        }

        System.out.println(result.toString());
    }

//    public static int solution(int N) {
//        String gaps = Integer.toBinaryString(N);
//        int maxLength = 0;
//        int max = 0;
//        boolean reachStart = false, reachEnd = false;
//        for (int i = 0; i < gaps.length(); i++){
//            if (gaps.charAt(i) == '1'){
//                if (reachStart)
//                    reachEnd = true;
//                else reachStart = true;
//            }
//
//            if (reachStart && gaps.charAt(i) == '0')
//                max++;
//
//            if (max > maxLength && reachEnd) {
//                maxLength = max;
//                max = 0;
//                reachEnd = false;
//            }
//
//        }
//
//        return maxLength;
//    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        MyLinkedList<Integer> list = new MyLinkedList<>();

        // filling the list
        int index = 0;
        while (index < A.length) {
            if (A[index] == -1)
                list.addLast(A[index++]);
            else
                list.orderedAdd(A[index++]);
        }


        System.out.println(list);

        return list.size() - 1;
    }

    static class MyLinkedList<T extends Comparable<T>> extends LinkedList<T> {


        public boolean orderedAdd(T element) {
            ListIterator<T> itr = listIterator();
            while (true) {
                if (!itr.hasNext()) {
                    itr.add(element);
                    return true;
                }

                T elementInList = itr.next();
                if (elementInList.compareTo(element) > 0) {
                    itr.previous();
                    itr.add(element);
                    return true;
                }
            }
        }
    }


}
