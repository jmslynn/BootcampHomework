package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ProductDao {
  private Connection connection;

  // menu queries
  private final String GET_PRODUCTS_QUERY = "SELECT * FROM products";
  private final String ADD_PRODUCT_QUERY = "INSERT INTO products(name, brand) VALUES (?, ?)";
  private final String EDIT_PRODUCT_NAME_BY_ID_QUERY = "UPDATE products SET name = ? WHERE id = ?";
  private final String DELETE_PRODUCT_BY_ID_QUERY = "DELETE FROM products WHERE id = ?";

  // constructor
  public ProductDao() {
    connection = DBConnection.getConnection();
  }

  // helper for displayProducts method in menu
  public List<Product> getProducts() throws SQLException {
    PreparedStatement ps = connection.prepareStatement(GET_PRODUCTS_QUERY);
    ResultSet rs = ps.executeQuery();
    List<Product> products = new ArrayList<Product>();

    while (rs.next()) {
      // must have all
      products.add(populateProductList(rs.getInt(1), rs.getString(2), rs.getString(3)));
      System.out.println("from list: id " + products.get(0).getProdId());
      System.out.println("from getProducts: id " + rs.getInt(1));

    }
    return products;
  }

  private Product populateProductList(int id, String name, String brand) {
    System.out.println("from populateProductList: " + id + name + brand);
    return new Product(id, name, brand);
  }

  public void createNewProduct(String prodName, String brand) throws SQLException {
    PreparedStatement ps = connection.prepareStatement(ADD_PRODUCT_QUERY);
    ps.setString(1, prodName);
    ps.setString(2, brand);
    ps.executeUpdate();
  }

  public void editProductById(int id, String newName) throws SQLException {
    PreparedStatement ps = connection.prepareStatement(EDIT_PRODUCT_NAME_BY_ID_QUERY);
    ps.setString(1, newName);
    ps.setInt(2, id);

    ps.executeUpdate();
  }

  public void deleteProductById(int id) throws SQLException {
    PreparedStatement ps = connection.prepareStatement(DELETE_PRODUCT_BY_ID_QUERY);
    ps.setInt(1, id);
    ps.executeUpdate();
  }

} // end class
