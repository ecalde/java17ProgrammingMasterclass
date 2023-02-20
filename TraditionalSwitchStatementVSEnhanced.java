public class TraditionalSwitchStatementVSEnhanced {
    public static void main(String[] args) {
        int switchValue = 1;
        String month = "APRIL";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

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

    public static String getQuarter(String month) {

        // Switch Statement Example Before Java 14
        switch (month) {
            case "JANURAY" :
            case "FEBRUARY" :
            case "MARCH" :
                return "1st";
            case "APRIL" :
            case "MAY" :
            case "JUNE" :
                return "2nd";
            case "JULY" :
            case "AUGUST" :
            case "SEPTEMBER" :
                return "3rd";
            case "OCTOBER" :
            case "NOVEMBER" :
            case "DECEMBER" :
                return "4th";
        }
        return "bad";
    }

    public static String getQuarterTwo(String month) {

        // Enhanced Switch Statement after Java 14 with return statement before switch
        return switch (month) {
            case "JANURAY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                // Introduced in Java 13. Yield is a new keyword to return a value back.
                // When to use "yield"
                //  - When your Switch statement is being used as a switch expression returning a value
                //  - Your case label uses a code block, with opening and closing curly braces.
                yield badResponse;
                // This is a test
            }
        };
    }


}
