package application;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import dao.MemberDao;
import dao.TeamDao;
import entity.Member;
import entity.Team;

public class Menu {

  private TeamDao teamDao = new TeamDao();
  private MemberDao memberDao = new MemberDao();
  private Scanner scanner = new Scanner(System.in);

  private List<String> options = Arrays.asList("Display All Teams", "Display A Team", "Create A Team", "Delete A Team",
      "Create Team Member", "Delete Team Member");

  public void start() {
    String selection = "";

    do {
      printMenu();
      selection = scanner.nextLine();
      try { // here's where we catch the exceptions
        if (selection.equals("1")) {
          displayTeams();

        } else if (selection.equals("2")) {
          displayTeam();

        } else if (selection.equals("3")) {
          createTeam();
        } else if (selection.equals("4")) {
          deleteTeam();
        } else if (selection.equals("5")) {
          createMember();
        } else if (selection.equals("6")) {
          deleteMember();
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }

      System.out.println("Press enter to continue...");
      scanner.nextLine();

    } while (!selection.equals("-1"));
  } // end start method

  private void printMenu() {
    System.out.println("Select an option:\n-----------");
    for (int i = 0; i < options.size(); i++) {
      // i+1 starts user view of counter at 1 instead of 0, options.get uses actual
      // counter
      System.out.println(i + 1 + ") " + options.get(i));
    }
  }

  private void displayTeams() throws SQLException {
    List<Team> teams = teamDao.getTeams();
    for (Team team : teams) {
      System.out.println(team.getTeamId() + ": " + team.getName());
    }
  }

  private void displayTeam() throws SQLException {
    System.out.print("Enter team id: ");
    // because passing an int and pausing the scanner, must parse results from
    // scanner, returns a string and parses to an int
    int id = Integer.parseInt(scanner.nextLine());
    Team team = teamDao.getTeamById(id);
    System.out.println(team.getTeamId() + ": " + team.getName());
    for (Member member : team.getMembers()) {
      System.out.println(
          "\tMemberId: " + member.getMemberId() + " - Name: " + member.getFirstName() + " " + member.getLastName());
    }
  }

  private void createTeam() throws SQLException {
    System.out.print("Enter new team name:");
    String teamName = scanner.nextLine();
    teamDao.createNewTeam(teamName);
  }

  private void deleteTeam() throws SQLException {
    System.out.print("Enter team id to delete:");
    int id = Integer.parseInt(scanner.nextLine());
    teamDao.deleteTeamById(id);
  }

  private void createMember() throws SQLException {
    System.out.print("Enter first name of new member:");
    String firstName = scanner.nextLine();
    System.out.print("Enter last name of new member:");
    String lastName = scanner.nextLine();
    System.out.print("Enter team id for new member:");
    int teamId = Integer.parseInt(scanner.nextLine());
    memberDao.createNewMember(firstName, lastName, teamId);
  }

  private void deleteMember() throws SQLException {
    System.out.print("Enter member id to delete:");
    int id = Integer.parseInt(scanner.nextLine());
    memberDao.deleteMemberById(id);
  }

}// end menu class
