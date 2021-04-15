package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Member;

public class MemberDao {

  private Connection connection;
  private final String GET_MEMBERS_BY_TEAM_ID_QUERY = "SELECT * FROM members WHERE team_id = ?";

  // constructor
  public MemberDao() {
    connection = DBConnection.getConnection();

  }

  public List<Member> getMembersByTeamId(int teamId) throws SQLException {
    PreparedStatement ps = connection.prepareStatement(GET_MEMBERS_BY_TEAM_ID_QUERY);
    ps.setInt(1, teamId);
    ResultSet rs = ps.executeQuery();
    List<Member> members = new ArrayList<Member>();

    while (rs.next()) {
      members.add(new Member(rs.getInt(1), rs.getString(2), rs.getString(3)));
    }
    return members;
  }

}// end class
