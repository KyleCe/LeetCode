package test.easy;

import algorithm.easy.SingleNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kyle on 25/04/2017.
 */
public class SingleNumberTest {
    @Test
    public void singleNumber() throws Exception {
        SingleNumber sn = new SingleNumber();
        int[] data = new int[]{1, 1, 2, 2, 3};
        assertEquals(3, sn.singleNumber(data));
        data = new int[]{5, 5, 1, 2, 2};
        assertEquals(1, sn.singleNumber(data));
    }

}