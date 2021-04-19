package entities;

//handles and holds data
public class Product {

  // these match the db table fields
  private int prodId;
  private String prodName;
  private String brand;

  // constructor
  public Product(int prodId, String prodName, String brand) {
    this.prodId = prodId;
    this.prodName = prodName;
    this.brand = brand;
  }


  // getters and setters
  public int getProdId() {
    return prodId;
  }

  public void setProdId(int prodId) {
    this.prodId = prodId;
  }

  public String getProdName() {
    return prodName;
  }

  public void setProdName(String prodName) {
    this.prodName = prodName;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

}
