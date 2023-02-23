/*
Write a method named hasSameLastDigit with three parameters of type int.

Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
If one of the numbers is not within the range, the method should return false.

The method should return true if at least two of the numbers share the same
rightmost digit; otherwise, it should return false.
*/
public class IfLoop_LastDigitChecker {
    public static void main(String[] args) {

    }
    public static boolean isValid(int number) {
        if ((number >= 10) && (number <= 1000))
            return true;
        else
            return false;
    }
    public static boolean hasSameLastDigit(int x, int y, int z) {
        int tempX = 0;
        int tempY = 0;
        int tempZ = 0;
        if (isValid(x) && isValid(y) && isValid(z)) {
            tempX = x % 10;
            tempY = y % 10;
            tempZ = z % 10;
            return (tempX == tempY || tempX == tempZ || tempY == tempZ);
        }
        else
            return false;
    }
}
