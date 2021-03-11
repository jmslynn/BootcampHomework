public class AsteriskLogger implements Logger {

  // method: output for log
  @Override
  public void logOutput(String log) {
    System.out.println(log); // this one has been fixed
  }

  // method: output for error
  @Override
  public void errorOutput(String error) {
    System.out.println("error output");

  }

} // end class
