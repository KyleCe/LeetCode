package algorithm.easy;

/**
 * Created by Kyle on 09/05/2017.
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        while (low < high) {
            int mid = (low + high) >>> 1;
            long val = mid * mid;
            if (val == num) {
                return true;
            } else if (val < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
