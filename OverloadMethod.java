public class OverloadMethod {
    public static void main(String[] args) {
        System.out.println("65 minutes, 45 seconds = " + getDurationString(65, 45));
        System.out.println("3945 seconds = " + getDurationString(3945));
    }
    public static String getDurationString(int seconds){
        if (seconds >= 0) {
            return (getDurationString((seconds / 60), seconds));
        } else
            return "Invalid Value";
    }
    public static String getDurationString(int minutes, int seconds){
        if ( (minutes >= 0) && ( (seconds >= 0) && (seconds <= 59) ) ) {
            return ((minutes / 60) + " h " + (minutes % 60 ) + " m " + (seconds % 60) + " s'");
        } else
            return "Invalid Value";
    }
    // testing update
}