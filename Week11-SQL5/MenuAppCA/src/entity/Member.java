package entity;

//this class handles and holds the data and allows movememt of the data in object oriented fashion
public class Member {
  // these match the db table fields
  private int memberId;
  private String firstName;
  private String lastName;

  // constructor
  public Member(int memberId, String firstName, String lastName) {
    this.memberId = memberId;
    this.firstName = firstName;
    this.lastName = lastName;

  }// end method

  // Getters and Setters
  public int getMemberId() {
    return memberId;
  }

  public void setMemberId(int memberId) {
    this.memberId = memberId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

} // end class
