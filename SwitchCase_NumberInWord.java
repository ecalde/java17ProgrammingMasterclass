public class SwitchCase_NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(8);
    }
    public static void printNumberInWord(int number){
        String word = switch (number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
        System.out.println(word);
    }
    /*
    // Traditional Switch Case before Java 14
        public static void printNumberInWord(int numero){
        String word;

        switch (numero){
            case 0 :
               word = "ZERO";
               break;
            case 1 :
               word = "ONE";
               break;
            case 2 :
               word = "TWO";
               break;
            case 3 :
                word = "THREE";
                break;
            case 4 :
                word = "FOUR";
                break;
            case 5 :
                word = "FIVE";
                break;
            case 6 :
                word = "SIX";
                break;
            case 7 :
                word = "SEVEN";
                break;
            case 8 :
                word = "EIGHT";
                break;
            case 9:
                word = "NINE";
                break;
            default:
                word = "OTHER";
                break;
        }

        System.out.println(word);
    }
     */
}
