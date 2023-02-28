/*
        Write a method named getGreatestCommonDivisor with two parameters of type int
        named first and second.

        If one of the parameters is < 10, the method should return -1
        to indicate an invalid value.

        The method should return the greatest common divisor of the two numbers (int).

        The greatest common divisor is the largest positive integer that can
        fully divide each of the integers (i.e. without leaving a remainder).


        For example 12 and 30:

        12 can be divided by 1, 2, 3, 4, 6, 12

        30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30

        The greatest common divisor is 6 since both 12 and 30 can be divided
        by 6, and there is no resulting remainder.
*/

public class WhileLoop_GreatestCommonDivisor {
    public static void main(String[] args) {

    }
    /*
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first >= 10 && second >= 10) {
            int gcd = 1;
            if (first > second) {
                for (int i = 1; i <= first; i++) {
                    if (first % i == 0 && second % i == 0 && i > gcd) {
                        gcd = i;
                    }
                }
            } else {
                for (int i = 1; i <= second; i++) {
                    if (second % i == 0 && first % i == 0 && i > gcd) {
                        gcd = i;
                    }
                }
            }

            return gcd;
        } else
            return -1;
    }

     */
    public static int getGreatestCommonDivisor(int first, int second) {
        if ( first >= 10 && second >= 10) {
            while (first != second) {
                if (first > second)
                    first -= second;
                else
                    second -= first;
            }
            return first;
        }
        else
            return -1;
    }
}
