package algorithm.easy;

/**
 * Created by Kyle on 21/05/2017.
 */
public class FirstUnique {
    public int firstUniqChar(String s) {
        int[] sArr = new int[26];
        for (int i = 0, len = s.length(); i < len; i++) {
            sArr[s.charAt(i) - 'a']++;
        }
        for (int i = 0, len = s.length(); i < len; i++) {
            if (sArr[s.charAt(i) - 'a'] < 2) return i;
        }
        return -1;
    }
}
