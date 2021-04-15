package entity;

import java.util.List;

// this class handles and holds the data and allows movememt of the data in
// object oriented fashion
public class Team {

  // these match the db table fields
  private int teamId;
  private String name;

  // and this holds the members of a team from the database
  private List<Member> members;

  // constructor
  public Team(int teamId, String name, List<Member> members) {
    this.teamId = teamId;
    this.name = name;
    this.members = members;

  }// end method

  // Getters and Setters
  public int getTeamId() {
    return teamId;
  }

  public void setTeamId(int teamId) {
    this.teamId = teamId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Member> getMembers() {
    return members;
  }

  public void setMembers(List<Member> members) {
    this.members = members;
  }

} // end class
