public class TraditionalSwitchStatementVSEnhanced {
    public static void main(String[] args) {
        int switchValue = 1;

        // Switch Statement Example Before Java 14
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3, 4, or 5");
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4, or 5");
                break;
        }

        // Enhanced Switch Statement after Java 14
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> System.out.println("Value was 3, 4, or 5");
            default -> System.out.println("Value was not 1, 2, 3, 4, or 5");
        }
    }


}
