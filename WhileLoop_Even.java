/*
 Create a method called isEvenNumber, that takes a parameter of type int. Its purpose is to
 determine if the argument passed to the method is an even number or not.
 Return true from the method, if it's an even number, otherwise return false.
 Next, use a while loop to test a range of numbers, from 5, up to and including 20, but prinitng out only the even numbers,
 etermined by the call to the isEvenNumber method.
*/
public class WhileLoop_Even {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        }
    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }
}
