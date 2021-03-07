public class SpacedLogger implements Logger {

  @Override
  public void logMethod(String log) {
    // print message with spaces between the letters
    System.out.println(log);
    System.out.println("M e s s a g e");
  }

  @Override
  public void errorMethod(String error) {
    // print "ERROR: + error message with spaces
    System.out.println(error);
    System.out.println("Error: " + "M e s s a g e");
  }

} // end class
