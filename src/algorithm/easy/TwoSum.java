package algorithm.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by KyleCe on 30/04/2017.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>(len);
        for (int i = 0; i < len; i++) {
            int toFind = target - nums[i];
            if (map.containsKey(toFind)) {
                return new int[]{map.get(toFind), i};
            }

            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("not found");
    }
}
