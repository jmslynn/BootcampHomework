public class SpacedLogger implements Logger {

    // method: take log string and space out
    @Override
    public void log(String log) {
        System.out.println(spacerizer(log));
    }

    // method: take error string and space out with bonus
    @Override
    public void error(String error) {
        System.out.println("ERROR: " + spacerizer(error));
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