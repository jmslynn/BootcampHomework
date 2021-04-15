public class App {

  public static void main(String[] args) {

    Logger spaceLog = new SpacedLogger();
    Logger spaceError = new SpacedLogger();

    spaceLog.log("Ufda!");
    spaceError.error("That was some coding, there!");

    // send log value to logOutput
    Logger starLog = new AsteriskLogger();
    Logger starError = new AsteriskLogger();

    starLog.log("But I have sisu!");
    starError.error("Now it's time for fika!");

  } // end main method
}// end app class