// import java.lang.reflect.Member;
// import java.util.Scanner;

// import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

public class App {
    public static void main(String[] args) throws Exception {
        // array with numeric values--long way
        // int[] numArray = new int[6];
        // array[0] = 1;
        // array[1] = 5;
        // array[2] = 5;
        // array[3] = 8;
        // array[4] = 13;
        // array[5] = 6;

        // array with numeric values -- short way
        int[] numArray = { 1, 5, 2, 8, 13, 6 };

        // print first element in array
        System.out.println(numArray[0]);

        // print last element in array without using number 5
        System.out.println(numArray[numArray.length - 1]);

        // print element in array at position 6---results in out of bounds exception
        // error--program stops
        // System.out.println(numArray[6]);

        // print element in array at position -1--results in out of bounds exception
        // error--program stops
        // System.out.println(numArray[-1]);

        // for loop that prints out each element
        System.out.println("for loop print each element");
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }

        // enhanced for loop to print out each element
        System.out.println("enhanced for loop to print each element");
        for (int i : numArray) {
            System.out.println(i);
        }

        // new variable called sum, loop that adds each element to the sum (35)
        double sum = 0;
        for (int i : numArray) {
            sum += i;
        }
        System.out.println("the sum of this loop is: " + sum);

        // new variable called average, assign the average value of the array (5.8333)
        double average = sum / numArray.length;
        System.out.println("the average of this loop is: " + average);

        // enhanced for loop to print each odd number in array (1, 5, 13)
        System.out.println("odd numbers in the array");
        for (int i : numArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        // array with names
        String[] nameArray = { "Sam", "Sally", "Thomas", "Robert" };

        // how many letters in the array?
        int sumLetters = 0;
        for (String name : nameArray) {
            sumLetters += name.length();
        }
        System.out.println("This array has " + sumLetters + " letters.");

        // method A- take string name and print greeting
        greetingString("Amanda");

        // method B- takes string name and returns greeting outside the method
        System.out.println(greetingString2("Thuy"));
        String greeting = greetingString2("Thor");
        System.out.println(greeting);

        // Question: analyze the difference between the two methods - what did you find
        // and how
        // are they different?
        // Answer: Method A makes use of the greeting within the method. You can't use
        // the greeting outside the method because it was not returned, or sent, out of
        // the method. Method B passes the greeting to the outside where it can be
        // turned into a variable and used throughout the program.

        // write and test method that takes a string and int and returns true if letters
        // in string > int
        System.out.println("isStringLongerThanNumber versions 1 and 2");
        System.out.println(isStringLongerThanNumber("Howdy", 3));
        System.out.println(isStringLongerThanNumber2("Hei", 7));

        // write and test method that takes string array and string and returns true if
        // string exists in array
        System.out.println("is the string in the array?");
        System.out.println(isStringInArray(nameArray, "Bob"));
        System.out.println(isStringInArray(nameArray, "Sam"));

        // write and test method that takes int array and returns smallest number
        System.out.println("What's the smallest number in the array?");
        System.out.println(findSmallestNumber(numArray));

        // write and test method that take double aray and returns the average
        System.out.println("average of array");
        double[] dubArray = { 29.8, 17.2, 35.9 }; // 27.6333
        System.out.println(findAverage(dubArray));

        // write and test method that takes string array and returns array of int where
        // each element matches length of string at that position
        System.out.println("extract string lengths");
        int[] nameLengths = extractStringLengths(nameArray);
        for (int number : nameLengths) {
            System.out.println(number);
        }

        // write and test method that takes array of strings and returns true if sum of
        // letters for all strings with even number of letters is greater than sum of
        // strings with odd
        System.out.println("compare odd and even number of characters in array elements");
        System.out.println(compareWordCharacters(nameArray));

        // write and test method that takes string and returns true if string is a
        // palindrome
        System.out.println("Is this word a palindrome?");
        System.out.println(findPalindrome("string"));
        System.out.println(findPalindrome("racecar"));

    } // end main method

    public static void greetingString(String name) {
        System.out.println("Hello " + name + "!");
    }

    public static String greetingString2(String name) {
        return "Hi, " + name + "!";
    }

    public static Boolean isStringLongerThanNumber(String string, int number) {
        if (string.length() > number) {
            return true;
            // } else {
            // return false;
        }
        return false; // shorthand, line only gets executed if boolean is false
    }

    // even shorter... statement is a boolean anyway so shorter to just return it
    public static Boolean isStringLongerThanNumber2(String string, int number) {
        return string.length() > number;
    }

    public static Boolean isStringInArray(String[] array, String string) {
        for (String str : array) {
            if (str.equals(string)) {
                return true;
            }
        }
        return false;
    } // end method

    public static int findSmallestNumber(int[] numArray) {
        int smallest = numArray[0];
        for (int num : numArray) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static double findAverage(double[] array) {
        double sum = 0;
        for (double number : array) {
            sum += number;
        }
        return sum / array.length;
    }

    public static int[] extractStringLengths(String[] strings) {
        int[] results = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            results[i] = strings[i].length();
        }
        return results;
    }

    public static Boolean compareWordCharacters(String[] array) {
        int even = 0;
        int odd = 0;

        for (String string : array) {
            if (string.length() % 2 == 0) {
                even += string.length();
            } else {
                odd += string.length();
            }
        }
        return even > odd;
    }

    public static Boolean findPalindrome(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}// end class
