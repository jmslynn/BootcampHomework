import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {

        // 1. ArrayList of String called employeeNames
        List<String> employeeNames = new ArrayList<String>();

        // 2. HashSet of Integer called ids
        Set<Integer> ids = new HashSet<Integer>();

        // 3. HashMap of Integer called employeeMap
        Map<Integer, String> employeeMap = new HashMap<Integer, String>();

        // 4. add 5 entries to ids and employeeNames
        employeeNames.add("Mimosa Jones");
        employeeNames.add("Jennifer Strange");
        employeeNames.add("Elizabeth Bennett");
        employeeNames.add("Dido Chase");
        employeeNames.add("Amelia Bedelia");

        // System.out.println("Names: " + employeeNames);

        ids.add(8);
        ids.add(19);
        ids.add(110);
        ids.add(141);
        ids.add(192);
        // System.out.println("ids: " + ids);
        // System.out.println(ids.size());

        // 5. loop to combine names and ids into the map
        int i = 0;
        for (Integer n : ids) {
            employeeMap.put(n, employeeNames.get(i));
            // System.out.println("id: " + n);
            // System.out.println("name: " + employeeNames.get(i));
            i++;

        }

        // 6. using for-each loop for iteration over Map.entrySet(), print
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        // 7. create StringBuilder: idsBuilder
        StringBuilder idsBuilder = new StringBuilder();

        // 8. iterate over ids hashset and append each id followed by a - to idsBuilder
        for (Integer id : ids) {
            idsBuilder.append(id + "-");
        }

        // 9. print to console
        System.out.println(idsBuilder.toString());

        // 10. create StringBUilder: namesBuilder
        StringBuilder namesBuilder = new StringBuilder();

        // 11. iterate over employeenames and append each name followed by a space to
        // namesBuilder
        for (int j = 0; j < employeeNames.size(); j++) {
            namesBuilder.append(employeeNames.get(j) + " ");
        }

        // 12. print to console
        System.out.println(namesBuilder.toString());
    }// end main method
} // end class
