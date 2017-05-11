package algorithm.easy;

/**
 * Created by Kyle on 11/05/2017.
 */
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class GuessNumber extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int guess = guess(mid);
            if (guess == 0) return mid;
            else if (guess == 1) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}
