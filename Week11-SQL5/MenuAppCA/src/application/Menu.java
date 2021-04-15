package application;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import dao.TeamDao;
import entity.Team;

public class Menu {

  private TeamDao teamDao;
  private Scanner scanner = new Scanner(System.in);

  private List<String> options = Arrays.asList("Display All Teams", "Display A Team", "Create A Team", "Delete A Team",
      "Create Team Member", "Delete Team Member");

  public void start() {
    String selection = "";

    do {
      printMenu();
      selection = scanner.nextLine();
      try {
        if (selection.equals("1")) {
          displayAllTeams();

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
    System.out.println("Select an option:\n----------------------------");
    for (int i = 0; i < options.size(); i++) {
      // i+1 starts user view of counter at 1 instead of 0, options.get uses actual
      // counter
      System.out.println(i + 1 + ") " + options.get(i));
    }
  }

  private void displayAllTeams() throws SQLException {
    List<Team> teams = teamDao.getTeams();
    for (Team team : teams) {
      System.out.println(team.getTeamId() + ": " + team.getName());
    }
  }

  private void displayTeam() {
  }

  private void createTeam() {
  }

  private void deleteTeam() {
  }

  private void createMember() {
  }

  private void deleteMember() {
  }

}// end menu class
