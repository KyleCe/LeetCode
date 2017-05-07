package algorithm.easy;

/**
 * Created by Kyle on 30/04/2017.
 */
public class ExcelColumnTitle {

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            n--;
            char c = (char) (n % 26 + 'A');
            n /= 26;
            sb.append(c);
        }
        return sb.reverse().toString();
    }

    public int titleToNumber(String s) {
        int result = 0;
        for (int i = 0, len = s.length(); i < len; i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }
}
