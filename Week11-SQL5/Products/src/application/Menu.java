package application;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import dao.ProductDao;
import entities.Product;

public class Menu {
  private ProductDao productDao = new ProductDao();
  private Scanner scanner = new Scanner(System.in);

  // used by printMenu method...get this right the first time
  private List<String> menuOptions = Arrays.asList("Display Products", "Add New Product", "Edit A Product",
      "Delete A Product");

  // start method
  public void start() {
    String selection = "";

    do { // do while statement
      printMenu();
      selection = scanner.nextLine();

      try { // catching all the exceptions
        if (selection.equals("1")) {
          displayProducts();
        } else if (selection.equals("2")) {
          addNewProduct();
        } else if (selection.equals("3")) {
          editProduct();
        } else if (selection.equals("4")) {
          deleteProduct();
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
      // has app pause until user hits enter to continue
      System.out.println("Press enter to continue...");
      scanner.nextLine();

    } while (!selection.equals("-1"));
  } // end start method

  // print menu
  private void printMenu() {
    System.out.println("Select an option:\n-----------------");
    for (int i = 0; i < menuOptions.size(); i++) {
      // starts user view of counter at 1
      System.out.println(i + 1 + ") " + menuOptions.get(i));
    }
  } // end print menu

  // menu item 1
  private void displayProducts() throws SQLException {
    List<Product> products = productDao.getProducts();
    for (Product product : products) {
      System.out.println(product.getProdId() + ": " + product.getBrand() + " " + product.getProdName());
    }
  }

  // menu item 2
  private void addNewProduct() throws SQLException {
    System.out.print("Enter product name:");
    String prodName = scanner.nextLine();
    System.out.print("Enter brand name:");
    String brand = scanner.nextLine();
    productDao.createNewProduct(prodName, brand);
  }

  // menu item 3
  private void editProduct() throws SQLException {
    System.out.print("Enter product id to edit:");
    int id = Integer.parseInt(scanner.nextLine());
    System.out.print("Enter new name:");
    String newName = scanner.nextLine();
    productDao.editProductById(id, newName);
  }

  // menu item 4
  private void deleteProduct() throws SQLException {
    System.out.print("Enter product id to delete:");
    int id = Integer.parseInt(scanner.nextLine());
    productDao.deleteProductById(id);
  }
} // end class
