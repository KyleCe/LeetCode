package algorithm.easy;

/**
 * Created by Kyle on 25/04/2017.
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;

        int head = 0;
        int tail = s.length() - 1;
        char headChar, tailChar;
        while (head <= tail) {
            headChar = s.charAt(head);
            tailChar = s.charAt(tail);
            if (!Character.isLetterOrDigit(headChar)) {
                head++;
            } else if (!Character.isLetterOrDigit(tailChar)) {
                tail--;
            } else {
                if (Character.toLowerCase(headChar) != Character.toLowerCase(tailChar)) {
                    return false;
                }
                head++;
                tail--;
            }
        }

        return true;
    }
}
