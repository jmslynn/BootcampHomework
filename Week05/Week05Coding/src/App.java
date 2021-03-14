public class App {
    public static void main(String[] args) throws Exception {

        AsteriskLogger asterisk = new AsteriskLogger();

        SpacedLogger spaced = new SpacedLogger();

        asterisk.logOutput("Please try again!"); // not the variable, call the method name
        asterisk.errorOutput("whoops-a-daisy!");

        spaced.logOutput("Stuff Happens");
        spaced.errorOutput("Insert nerdy phrase here");

    }// end main method
}// end class
