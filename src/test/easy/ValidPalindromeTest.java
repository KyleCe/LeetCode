package test.easy;

import algorithm.easy.BestTime2BuyAndSell;
import algorithm.easy.ValidPalindrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


/**
 * Created by Kyle on 25/04/2017.
 */
public class ValidPalindromeTest extends BestTime2BuyAndSell {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void isPalindrome() throws Exception {
        ValidPalindrome vp = new ValidPalindrome();
        assertTrue(vp.isPalindrome("a."));
        assertTrue(vp.isPalindrome("a.a"));
        assertTrue(vp.isPalindrome("AB.ba"));
        assertTrue(vp.isPalindrome("a b. B    a"));
    }
}