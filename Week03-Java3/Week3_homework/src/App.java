public class App {
    public static void main(String[] args) throws Exception {
        // 1. Int array of ages
        int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };

        // a. subtract first element from last.
        System.out.println("subtract first element from last");
        System.out.println(ages[ages.length - 1] - ages[0]);

        // b. add new age to array
        int n = ages.length;
        int[] newAges = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newAges[i] = ages[i];
            System.out.println(newAges[i]);
        }
        newAges[n] = 24;
        System.out.println(newAges[n]);

        System.out.println("subtract first element from last");
        System.out.println(newAges[newAges.length - 1] - ages[0]);

        // c. loop through array and calculate average age (28)
        double sum = 0;
        for (int i : newAges) {
            sum += i;
        }
        double avg = sum / newAges.length;
        System.out.println("average age in newAges array is:" + avg);

        // 2. string array names
        String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

        // a. looop through and calculate average number letters per name (3.83)
        double sumLetters = 0;
        for (String name : names) {
            sumLetters += name.length();
        }
        double avgLetters = sumLetters / names.length;
        System.out.println("average number of letters in name array is: " + avgLetters);

        // b. loop through array and concatenate all names
        String allNames = "";
        for (int i = 0; i < names.length; i++) {
            String a = names[i];
            if (i < names.length - 1) {
                allNames = allNames.concat(a + ", ");
            } else {
                allNames = allNames.concat(a);

            }
        }
        System.out.println(allNames);

        // 3. how access last element of any array?
        // arrayName[arrayName.length - 1]

        // 4. how access first element of any array?
        // arrayName[0]

        // 5. New int array nameLengths, fill with length of names in names array
        int[] nameLengths = new int[6];
        for (int i = 0; i < nameLengths.length; i++) {
            nameLengths[i] = names[i].length();
            // System.out.println(nameLengths[i]);
        }
        // 6. calculate sum of all elements in the nameLengths array
        int nameSum = 0;
        for (int i : nameLengths) {
            nameSum += i;
        }
        System.out.println("The sum of all elements in nameLengths is: " + nameSum);

        // 7. method: word string, n int returns wordxn
        System.out.println("method returns word x n");
        System.out.println(stringNTimes("Code", 5));

        // 8. method: firstName, lastName and returns full name
        String firstName = "Thuy";
        String lastName = "Shields";
        System.out.println("name: " + fullName(firstName, lastName));

        // 9. method: int array, returns true if sum > 100
        int[] mathRanking = { 61, 62, 96, 87, 34, 120, 139, 219 };
        System.out.println("the sum of mathRanking scores is greater than 100: " + isSum100(mathRanking));

        // 10. method: array of double and returns average of all elements
        double[] engineeringRank = { 27, 41, 44, 59, 69, 109, 113, 190 };
        System.out.println("The average of values in engineeringRank is: " + findAvg(engineeringRank));

        // 11. method: 2 double arrays, returns true if avg of array 1 > avg array 2
        double[] studentLifeRank = { 64, 76, 214, 53, 576, 129, 65, 134 };
        double[] diversityRank = { 51, 23, 418, 478, 25, 158, 217, 0 };
        System.out.println(
                "studentLifeRank average > diversityRankAverage: " + findLargerAvg(studentLifeRank, diversityRank));

        // 12; method: willBuyDrink receives boolean isHotOutside and double
        // moneyInPocket and returns true if is hot outside and money > 10.50
        boolean isHotOutside = false;
        double moneyInPocket = 25.46;
        System.out.println("I will buy a drink: " + willBuyDrink(isHotOutside, moneyInPocket));
        // 13. method: solve a problem
        // My son is applying to colleges. He put together a spreadsheet with data for
        // each school and included rankings from niche.com on various things. It's hard
        // to see in a spreadsheet which schools have the best ranking for each. This
        // method will take the strings I created for other methods, find the best rank
        // in each, and link it to it's corresponding school. The schools hold the same
        // place in each array.
        double[] mathRank = { 61, 62, 96, 87, 34, 120, 139, 219 };
        String[] schools = { "Northeastern University", "Boston University", "Worcester Polytechnic Institute",
                "University of Pittsburgh", "University of Rochester", "UCONN - Storrs", "UMASS - Amherst",
                "University of New Hampshire" };
        System.out.println("The school with the best ranking for math is: " + whichSchool(mathRank, schools));
        System.out.println(
                "The school with the best ranking for engineering is: " + whichSchool(engineeringRank, schools));
        System.out.println(
                "The school with the best ranking for student life is: " + whichSchool(studentLifeRank, schools));
        System.out.println("The school with the best ranking for diversity is: " + whichSchool(diversityRank, schools));

    } // end main method

    public static String stringNTimes(String string, int number) {
        String string2 = string;
        for (int i = 0; i < number - 1; i++) {
            string = string.concat(string2);
        }
        return string;
    }

    public static String fullName(String first, String last) {
        String name = first + " " + last;
        return name;
    }

    public static boolean isSum100(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        if (sum > 100) {
            return true;
        }
        return false;
    }

    public static double findAvg(double[] array) {
        double sum = 0;
        for (double d : array) {
            sum += d;
        }
        double avg = sum / array.length;
        return avg;
    }

    public static Boolean findLargerAvg(double[] life, double[] diversity) {
        double sumLife = 0;
        double sumDiv = 0;
        for (double d : life) {
            sumLife += d;
        }
        double avgLife = sumLife / life.length;
        for (double d2 : diversity) {
            sumDiv += d2;
        }
        double avgDiv = sumDiv / diversity.length;
        if (avgLife > avgDiv) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean willBuyDrink(boolean hotOut, double money) {
        if (hotOut && money > 10.5) {
            return true;
        } else {
            return false;
        }
    }

    public static String whichSchool(double[] ranks, String[] schools) {
        double best = ranks[0];
        String school = schools[0];
        for (int i = 0; i < 8; i++) {
            if (best > ranks[i] && ranks[i] != 0) {
                best = ranks[i];
                school = schools[i];
            } // close if
        } // close for
        return school;

    }// close method
}// end class
