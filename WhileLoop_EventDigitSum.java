/*
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
*/
public class WhileLoop_EventDigitSum {
    public static void main(String[] args) {

    }
    public static int getEvenDigitSum(int number){
        if(number < 0)
            return -1;
        int sum = 0;
        int store = number;
        int temp = 0;

        while(store > 0) {
            temp = store % 10;
            if (temp % 2 == 0) {
                sum += temp;
                store /= 10;
            } else
                store /= 10;
        }
        return sum;
    }
}
