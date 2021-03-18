public class AsteriskLogger implements Logger {

    // method: output for log
    @Override
    public void log(String log) {
        System.out.println("***" + log + "***");
    }

    // method: output for error
    @Override
    public void error(String error) {
        System.out.println(starinator(error));
        System.out.println("***ERROR: " + error + "***");
        System.out.println(starinator(error));

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