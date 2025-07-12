package binarysearch.guessnumberhigherorlower_374;

/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public Solution(int pickedNumber) {
        super(pickedNumber);
    }

    public int guessNumber(int n, int pick) {
        int l = 1;
        int r = n;

        while (l <= r) {
            int num = l + ((r - l) / 2);
            if (guess(num) == 0) {
                return num;
            } else if (guess(num) < 0) {
                r = num - 1;
            } else {
                l = num + 1;
            }
        }
        return 0;
    }
}
