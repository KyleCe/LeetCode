package algorithm.easy;

/**
 * Created by Kyle on 09/05/2017.
 */
public class PowerOfFour {

    public boolean isPowerOfFour(int num) {
        return (num > 0) && ((num & (num - 1)) == 0) && ((num & 0x55555555) == num);
    }
}
