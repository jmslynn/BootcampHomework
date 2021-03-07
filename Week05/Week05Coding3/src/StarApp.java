public class StarApp {
    public static void main(String[] args) throws Exception {
        // send log value to logOutput
        String starLog = "hippity"; // this will be elsewhere later
        createLogOutput(starLog);

        // send error value to starinator to create string of stars
        String starError = "hoppity"; // this will be elsewhere later

        // send error value and sbStars to createErrorOutput
        createErrorOutput(starinator(starError), starLog);

    } // end main method

    // method: output for log
    public static void createLogOutput(String log) {
        System.out.println("log output");
        System.out.println("***" + log + "***");
    }

    // method: output for error
    public static void createErrorOutput(String stars, String message) {
        System.out.println("error output");
        System.out.println(stars);
        System.out.println("***ERROR: " + message + "***");
        System.out.println(stars);

    }

    // method: take length of string, create string of stars the same
    // length
    public static String starinator(String str) {
        int n = str.length() + 13;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("*");
        }

        return sb.toString();
    }

}// end class