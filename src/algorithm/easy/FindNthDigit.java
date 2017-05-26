package algorithm.easy;

/**
 * Created by Kyle on 27/05/2017.
 */
public class FindNthDigit {
    public int solution(int n) {
        int len = 1;
        long count = 9;
        int start = 1;

        while (n > len * count) {
            n -= len++ * count;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / len;
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }
}
