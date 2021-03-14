package algorithm.easy;

import org.junit.Test;

import algorithm.base.Base;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by KyleCe on 2021/3/14
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * <p>
 * <p>
 * Example 2:
 * <p>
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 */
public class IsSubsequence extends Base {

    @Test
    public void main() {
        {
            String s = "abc", t = "ahbgdc";
            assertTrue(isSubsequence(s, t));
        }
        {
            String s = "axc", t = "ahbgdc";
            assertFalse(isSubsequence(s, t));
        }
        {
            String s = "bdc", t = "ahbgdc";
            assertTrue(isSubsequence(s, t));
        }
        {
            String s = "aaaaaa", t = "bbaaaa";
            assertFalse(isSubsequence(s, t));
        }
    }

    public boolean isSubsequence(String source, String target) {
        //log("for source      source=", source, "target=", target);
        char[] cArrSource = source.toCharArray();
        char[] cArrTarget = target.toCharArray();

        boolean match;
        for (int i = 0, j = 0, lenS = cArrSource.length, lenT = cArrTarget.length; i < lenS; i++) {
            match = false;
            for (; j < lenT; j++) {
                //log("for j      j=", j);
                if (target.charAt(j) == source.charAt(i)) {
                    match = true;
                    j++;
                    break;
                }
            }
            //log("for i      i=", i, "match?=", match);

            if (match) {
                if (i == lenS - 1) {
                    return true;
                }
                continue;
            }
            return false;
        }

        return true;
    }
}
