package algorithm.easy;

import java.util.Stack;

/**
 * Created by Kyle on 09/05/2017.
 */
public class ReverseVowels {
    public String reverseVowels(String s) {
        if (s == null || s.length() <= 1) return s;
        char[] chs = s.toCharArray();
        String upperStr = s.toUpperCase();
        for (int i = 0, j = s.length() - 1; i < j; ) {
            if (!isVowels(upperStr.charAt(i))) {
                i++;
                continue;
            }
            if (!isVowels(upperStr.charAt(j))) {
                j--;
                continue;
            }
            char tmp = s.charAt(i);
            chs[i] = chs[j];
            chs[j] = tmp;
            i++;
            j--;
        }
        return String.valueOf(chs);
    }

    public String reverseVowelsWithStack(String s) {
        String upperStr = s.toUpperCase();
        Stack<Character> stack = new Stack<>();
        for (int i = 0, len = s.length(); i < len; i++) {
            if (isVowels(upperStr.charAt(i))) stack.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0, len = s.length(); i < len; i++) {
            if (isVowels(upperStr.charAt(i)))
                sb.append(stack.pop());
            else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    private boolean isVowels(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
