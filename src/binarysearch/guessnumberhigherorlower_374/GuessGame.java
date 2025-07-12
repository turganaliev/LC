package binarysearch.guessnumberhigherorlower_374;

public abstract class GuessGame {
    protected int pickedNumber;

    public GuessGame(int pickedNumber) {
        this.pickedNumber = pickedNumber;
    }

    /**
     * @param num   your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     * otherwise return 0
     */
    public int guess(int num) {
        if (num > pickedNumber) {
            return -1;
        } else if (num < pickedNumber) {
            return 1;
        } else {
            return 0;
        }
    }
}
