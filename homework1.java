public class homework1 {
    public static void main(String[] args) throws Exception {
        // variables group 1
        double price1 = 24.99;
        double price2 = 14.55;
        double cashOnHand1 = 37.28;
        double cashOnHand2 = 0.05;
        int numberFriends1 = 45;
        int numberFriends2 = 35;
        int myAge = 45;
        int joeAge = 25;
        String firstName1 = "Jennifer";
        String firstName2 = "Emsley";
        String lastName1 = "Sundberg";
        String lastName2 = "Lynn";
        char middleInit = 'S';
        char midInitial = 'M';

        // Output of variables group 1
        System.out.println(
                "Do you want to buy the flowers that cost $" + price1 + " or the ones that cost $" + price2 + "?");
        System.out.println("Did mom give you $" + cashOnHand1 + " or $" + cashOnHand2 + " to spend on flowers?");
        System.out.println("I met " + numberFriends1 + " people in Kentucky and " + numberFriends2
                + " people when I lived in Minnesota.");
        System.out.println("I am " + myAge + " years old and Joe is " + joeAge + " months old.");
        System.out.println(firstName1 + " " + lastName2 + ", have you met " + firstName2 + " " + lastName1 + "?");
        System.out.println("My middle initial used to be " + middleInit + " and now it is " + midInitial + ".");

        // variables and output group 2
        cashOnHand1 -= price1;
        System.out.println("After buying the flowers I have $" + cashOnHand1 + " left.");

        /*
         * my machine is displaying many more places beyond the decimal than needed (or
         * logical). Matthew said it was ok to have results in the terminal instead of
         * output, but I'll try and fix it later to see if it fixes the display for this
         * one.
         */

        // What I learned in my search to fix the display error
        System.out.printf("After buying the flowers I have $%.2f %n", cashOnHand1);

        // and back to the assignment
        int friendsPerYear = (numberFriends1 + numberFriends2) / myAge;
        System.out.println("I have made approximately " + friendsPerYear + " friend per year.");

        String fullName = firstName1 + " " + middleInit + ". " + lastName2;
        System.out.println("My name is " + fullName + ".");

    }
}
