public class App {
    public static void main(String[] args) throws Exception {

        AsteriskLogger asterisk = new AsteriskLogger();

        SpacedLogger spaced = new SpacedLogger();

        asterisk.logOutput("Please try again!"); // not the variable, call the method name
        asterisk.error("whoops-a-daisy!");

        spaced.log("Stuff Happens");
        spaced.error("Insert nerdy phrase here");

    }// end main method
}// end class
