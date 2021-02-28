import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        // string vs stringbuilder: you can change a stringbuilder

        // new stringbuilder, characters 0-9 sep by dashes
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(i);
            if (i < 9) {
                sb.append("-");
            }
        }
        System.out.println(sb.toString());

        // list of strings and add 5 strings of different lengths
        List<String> strings = new ArrayList<String>();
        strings.add("Tom");
        strings.add("Sandra");
        strings.add("Paula");
        strings.add("Em");
        strings.add("Allan");

        // Note: List<String> strings = Arrays.asList("Tom", "Sammy", "George") ...more
        // compact

        // method: take list of strings and return shortest string
        System.out.println("shortest string: " + findShortestString(strings));

        // method: list of strings and returns list with first and last element switched
        System.out.println("switch first and last elements");
        List<String> swapped = switchListItems(strings);
        for (String string : swapped) {
            System.out.println(string);
        }

        // method: take list of strings and return a string with all lists elements
        // concatenated, sep by commas
        System.out.println("the comma separated list");
        System.out.println(combineStrings(swapped));

        // method: take list of strings and a string and return new list with all
        // strings that match the second string parameter (like a search method)
        System.out.println("search-like method");
        List<String> searchResults = search(strings, "a");
        for (String result : searchResults) {
            System.out.println(result);
        }

        // method: takes list of int and returns a list in a list where list 1 has
        // numbers div by 2, list 2 has numbers div by 3, list 3 has numbers div by 5,
        // and list 4 has all the rest
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 17, 20, 26, 30);

        List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numbers);

        for (List<Integer> list : sortedNumbers) {
            for (Integer number : list) {
                System.out.println(number);
            }
            System.out.println("Next list ------------");
        }
        // method: list of strings and returns a list of int with length of each string
        List<Integer> stringsLengths = calculateStringLengths(strings);
        for (Integer i : stringsLengths) {
            System.out.println(i);

        }

        // add 5 values to a set of strings

        // Creating an empty Set
        Set<String> set = new HashSet<String>();

        // Use add() method to add elements into the Set
        set.add("Welcome");
        set.add("To");
        set.add("Geeks");
        set.add("4");
        set.add("Geeks");
        set.add("Set");

        // Displaying the Set
        System.out.println("Set: " + set);

        // method: set of strings and a character and returns set of strings with all
        // the strings that start with that character
        System.out.println("--------");

        Set<String> startsWithT = findAllThatStartWith(set, 'T');
        for (String word : startsWithT) {
            System.out.println(word);

        }

        // method: takes set of strings and returns list of the same strings--convert
        // set of strings to a list
        System.out.println("--------");
        List<String> resultList = convertSetToList(set);
        for (String listString : resultList) {
            System.out.println(listString);

        }
        // method: takes set of integers and returns new set of integers containing only
        // even numbers from orig set
        Set<Integer> integerSet = new HashSet<Integer>();
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(7);
        integerSet.add(8);

        Set<Integer> extractedEvens = extractEvens(integerSet);
        for (Integer number : extractedEvens) {
            System.out.println(number);
        }
        // add 3 items to a map of string where the key of each is a word and the value
        // is the definition
        Map<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("hus", "house");
        dictionary.put("elsker", "love");
        dictionary.put("Jeg", "I");
        dictionary.put("Ha Det", "bye");

        // method: take a map<string, string> and a string and return the value for a
        // key in the map that matches the string paramenter, language dictionary look
        // up
        String value = lookupValue(dictionary, "elsker");
        System.out.println(value);

        // method: list<string> and returns a map< char, int> containing a count of all
        // the strings that start with a given character
        Map<Character, Integer> counts = countStartingLetters(resultList);
        for (Character character : counts.keySet()) {
            System.out.println(character + " - " + counts.get(character));
        }

    } // end main method

    public static Map<Character, Integer> countStartingLetters(List<String> list) {
        Map<Character, Integer> results = new HashMap<Character, Integer>();
        for (String string : list) {
            char c = string.charAt(0);
            if (results.get(c) == null) {
                results.put(c, 1);
            } else {
                results.put(c, results.get(c) + 1);
            }
        }

        return results;
    }

    public static String lookupValue(Map<String, String> map, String string) {
        for (String key : map.keySet()) {
            if (key.equals(string)) {
                return map.get(key);
            }
        }
        return " ";
    }

    public static Set<Integer> extractEvens(Set<Integer> set) {
        Set<Integer> results = new HashSet<Integer>();
        for (Integer number : set) {
            if (number % 2 == 0) {
                results.add(number);
            }
        }
        return results;
    }

    public static List<String> convertSetToList(Set<String> set) {
        List<String> results = new ArrayList<String>();

        for (String string : set) {
            results.add(string);
        }
        return results;
    }

    public static Set<String> findAllThatStartWith(Set<String> set, char c) {
        Set<String> results = new HashSet<String>();
        for (String string : set) {
            if (string.charAt(0) == c) {
                results.add(string);
            }
        }
        return results;
    }

    public static List<Integer> calculateStringLengths(List<String> list) {
        List<Integer> lengths = new ArrayList<Integer>();
        for (String string : list) {
            lengths.add(string.length());
        }
        return lengths;
    }

    public static List<List<Integer>> sortDivisibleNumbers(List<Integer> list) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        results.add(new ArrayList<Integer>());
        results.add(new ArrayList<Integer>());
        results.add(new ArrayList<Integer>());
        results.add(new ArrayList<Integer>());

        for (Integer number : list) {
            if (number % 2 == 0) {
                results.get(0).add(number);
            }
            if (number % 3 == 0) {
                results.get(1).add(number);
            }
            if (number % 5 == 0) {
                results.get(2).add(number);
            }
            if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
                results.get(3).add(number);
            }
        }
        return results;
    }

    public static List<String> search(List<String> list, String query) {
        List<String> results = new ArrayList<String>();
        for (String string : list) {
            if (string.contains(query)) {
                results.add(string);
            }
        }
        return results;
    }// end method

    public static String combineStrings(List<String> strings) {
        StringBuilder result = new StringBuilder();
        for (String string : strings) {
            result.append(string + ", ");
        }
        return result.toString();
    }

    public static List<String> switchListItems(List<String> list) {
        String temp = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.set(list.size() - 1, temp);
        return list;

    }

    public static String findShortestString(List<String> list) {
        String shortest = list.get(0);
        for (String string : list) {
            if (string.length() < shortest.length()) {
                shortest = string;
            }
        }
        return shortest;
    }
} // end class
