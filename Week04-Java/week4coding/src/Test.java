import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
  public static void main(String[] args) {
    Map<String, String> groceryMap = new HashMap<String, String>();

    groceryMap.put("Apple", "aisle 4");
    groceryMap.put("Artichoke", "bin 3");
    groceryMap.put("Potato", "bin 7");
    groceryMap.put("Yogurt", "dairy");
    List<String> list = new ArrayList<String>();
    // getValuesFromMapWhereKeyStartsWithA(groceryMap);

  }// end method

  // public List<String> getValuesFromMapWhereKeyStartsWithA(Map<String, String>
  // map) {

  // char key = 'A';
  // for (String string : map) {

  // }
  // return list;
  // }
}// end class

// Test questions I missed

// Write a method that takes a Map<String, String>. Return a List<String>
// containing every value of the Map where the key starts with 'A'.

// HashMap<String, String> groceryMap = new HashMap<String, String>();

// groceryMap.put("Apple", "aisle 4");
// groceryMap.put("Artichoke", "bin 3");
// groceryMap.put("Potato", "bin 7");
// groceryMap.put("Yogurt", "dairy");

// public List<String> getValuesFromMapWhereKeyStartsWithA(Map<String, String>
// map) {

// List<String> list = new ArrayList<String>();
// char key = 'A';
// for (String string : map) {

// }
// return list;

// }

// Write a method that takes a List and returns a new List containing every
// other element in the original List. Note that the returned List should be
// half the size of the original List. If the original List has an odd number of
// elements, the returned List should have half the amount of elements rounded
// down (i.e. original List has 5, returned List has 2).

// public List createListWithEveryOtherElement(List list) {

// }