package algorithm.easy;

import java.util.Arrays;

/**
 * Created by Kyle on 07/05/2017.
 */
public class MajorElements {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
