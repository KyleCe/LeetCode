package test.easy;

import org.junit.Assert;

import algorithm.easy.TwoSum;

/**
 * Created by KyleCe on 2020/11/22
 */
public class TwoSumTest {

    @org.junit.Test
    public void twoSum() {
        int[] input = new int[]{3, 2, 4};
        int target = 6;
        TwoSum t = new TwoSum();
        Assert.assertArrayEquals(t.twoSum(input, target), new int[]{1, 2});
    }
}