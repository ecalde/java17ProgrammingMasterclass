/*
 Create a method called isEvenNumber, that takes a parameter of type int. Its purpose is to
 determine if the argument passed to the method is an even number or not.
 Return true from the method, if it's an even number, otherwise return false.
 Next, use a while loop to test a range of numbers, from 5, up to and including 20, but printing out only the even numbers,
 entered by the call to the isEvenNumber method.
 Make it also record the total number of even numbers it has found.
 Break out of the loop, once 5 even numbers are found.
 Finally, display the total number of odd and even numbers found.
*/
public class WhileLoop_Even {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int even = 0;
        int odd = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                odd++;
                continue;
            }
            even ++;
            System.out.println("Even number " + number);
            if (even == 5)
                break;
        }
        System.out.println("Total even numbers found = " + even);
        System.out.println("Total odd numbers found = " + odd);
    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }
}
