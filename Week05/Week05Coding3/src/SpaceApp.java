public class SpaceApp {
    public static void main(String[] args) throws Exception {
        String spaceLog = "word";
        Log(spacerizer(spaceLog));

        String spaceError = "Op!";

        Error(spacerizer(spaceError));

    } // end main method

    // method: take log string and space out
    public static void Log(String log) {
        System.out.println(log);
    }

    // method: take error string and space out with bonus
    public static void Error(String error) {
        System.out.println("ERROR: " + error);
    }

    // method: takes a string and adds spaces
    public static String spacerizer(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str.charAt(i) + " ");
        }
        return sb.toString();

    }

}// end class