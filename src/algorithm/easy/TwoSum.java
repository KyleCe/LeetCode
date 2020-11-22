package algorithm.easy;

/**
 * Created by KyleCe on 30/04/2017.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int c = nums[left] + nums[right];
            if (c == target) return new int[]{left + 1, right + 1};
            else if (c > target) right--;
            else left++;
        }
        return null;
    }
}
