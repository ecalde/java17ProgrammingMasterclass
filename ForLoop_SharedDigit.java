/*
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive).
If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers,
such as 2 in 12 and 23; otherwise, the method should return false.


*/
public class ForLoop_SharedDigit {
    public static void main(String[] args) {

    }
    public static boolean hasSharedDigit (int num1, int num2){
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        for(int i = num1; i > 0; i /= 10) {
            for(int j = num2; j > 0 ; j /= 10) {
                if(i % 10 == j % 10){
                    return true;
                }
            }
        }
        return false;
    }
}
