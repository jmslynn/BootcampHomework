
public class Card {
  // Fields
  public int value;
  public String name;

  // constructor
  public Card(int value, String name) {
    this.value = value;
    this.name = name;
  }

  // Getters and Setters:
  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Describe Cards
  public String describeCard() {
    return name + ", worth " + value + " points";
  }

}// end class
