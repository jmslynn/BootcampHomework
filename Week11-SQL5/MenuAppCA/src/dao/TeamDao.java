package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Team;

public class TeamDao {
  private Connection connection;
  private MemberDao memberDao;
  private final String GET_TEAMS_QUERY = "SELECT * FROM teams";

  // constructor
  public void TeamDAO() {
    connection = DBConnection.getConnection();
  }

  // get teams method
  public List<Team> getTeams() throws SQLException {
    ResultSet rs = connection.prepareStatement(GET_TEAMS_QUERY).executeQuery();
    List<Team> teams = new ArrayList<Team>();

    // get id and name from teams table
    while (rs.next()) {
      teams.add(populateTeam(rs.getInt(1), rs.getString(2)));
    }
    return teams; // array list
  }

  private Team populateTeam(int id, String name) throws SQLException {

    return new Team(id, name, memberDao.getMembersByTeamId(id));
  }

} // end class
