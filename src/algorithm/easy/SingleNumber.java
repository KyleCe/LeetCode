package algorithm.easy;

import java.util.Arrays;

/**
 * Created by Kyle on 25/04/2017.
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int ans = 0;

        int len = nums.length;
        for (int i = 0; i != len; i++)
            ans ^= nums[i];

        return ans;
    }

    public int singleNumber2(int[] nums) {
        if (nums.length == 1) return nums[0];
        Arrays.sort(nums);
        int res = nums[0];
        boolean match = false;
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            int k = nums[i];
            if (match) {
                res = k;
                match = false;
            } else {
                if (res == k) {
                    match = true;
                } else {
                    return res;
                }
            }
        }
        return res;
    }
}
