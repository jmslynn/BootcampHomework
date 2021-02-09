public class lab1 {
    public static void main(String[] args) throws Exception {
        // quantity of available seats left on a plane
        int availSeats = 4;

        // cost of groceries at checkout
        double totalCostGroceries = 43.05;

        // middle initial
        char midInitial = 'A';

        // true if hot outside, false if cold
        boolean isHotOutside = true;

        // customer first name
        String customerFirstName = "Madge";

        // street address
        String streetAddress = "4306 Oak Avenue South";

        // print all variables to console
        System.out.println("There are " + availSeats + " seats left on the plane, but none of them are together.");
        System.out.println("Your shopping total is: $" + totalCostGroceries);
        System.out.println("Is your middle initial " + midInitial + "?");
        System.out.println("It is hot outside - " + isHotOutside);
        System.out.println("Thank you for shopping at Target, " + customerFirstName + "!");
        System.out.println("Is there a Kroger at " + streetAddress + " in Middlevile?");

        // remove 2 seats from available seats
        // availSeats = availSeats - 2;
        availSeats -= 2;
        System.out.println(availSeats);

        // add 2.15 to total for impulse purchase
        totalCostGroceries += 2.15;
        System.out.println(totalCostGroceries);

        // change middle inital
        midInitial = 'R';
        System.out.println(midInitial);

        // update hot outside variable to be oposite
        isHotOutside = !isHotOutside;
        System.out.println(isHotOutside);

        // create new variable called full name combining first and middle and adding a
        // last name
        String customerFullName = customerFirstName + " " + midInitial + ". Jones";

        // print to console full name of customer and address
        System.out.println("We have a record of a " + customerFullName + " residing at " + streetAddress + ".");

    }
}
