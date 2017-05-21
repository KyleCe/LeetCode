package algorithm.easy;

/**
 * Created by Kyle on 21/05/2017.
 */
public class FindDifference {
    public char findTheDifference(String s, String t) {
        int[] sArr = new int[26];
        for (int i = 0, len = s.length(); i < len; i++) {
            sArr[s.charAt(i) - 'a']++;
        }
        int[] tArr = new int[26];
        for (int i = 0, len = t.length(); i < len; i++) {
            tArr[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (sArr[i] != tArr[i]) return (char) ('a' + i);
        }
        return 'a';
    }
}
