public class App {
    public static void main(String[] args) throws Exception {
        // create variable named age and assign 14
        int age = 14;

        // boolean expression age...
        System.out.println(age >= 16);

        // change age to 18
        age = 18;
        System.out.println(age >= 16);

        // you can drive conditional ...
        boolean hasLicense = false;
        age = 17;
        if (age >= 16 && hasLicense) {
            System.out.println("You can drive!");
        } else {
            System.out.println("You cannot drive.");
        }

        // milk and thirst conditional
        double costOfMilk = 2.45;
        int thirstLevel = 7;
        if (costOfMilk < 2.50 || thirstLevel > 6) {
            System.out.println("Milk please!");

        } else {
            System.out.println("No thanks.");
        }

        // cookies and kids
        int numberOfCookies = 47;
        int numberOfChildren = 6;
        int remainingCookies = numberOfCookies % numberOfChildren;

        if (remainingCookies == 0) {
            System.out.println("Sad Face");
        } else if (remainingCookies < 2) {
            System.out.println("Yes!");
        } else if (remainingCookies < 5) {
            System.out.println("Whoohooo!");
        } else {
            System.out.println("Jackpot!!");
        }

        // loyalty member status
        String loyaltyMemberStatus = "Silver";
        double loyaltyMemberDiscount = 0.0;

        switch (loyaltyMemberStatus) {
            case "Silver":
                loyaltyMemberDiscount = .1;
                break;
            case "Gold":
                loyaltyMemberDiscount = .15;
                break;
            case "Platinum":
                loyaltyMemberDiscount = .25;
                break;
        }
        System.out.println(loyaltyMemberDiscount);

        // bill total adjustments
        double billTotal = 747.29;
        double discountedAmount = billTotal * loyaltyMemberDiscount;
        double adjustedTotal = billTotal - discountedAmount;
        System.out.println(adjustedTotal);

        // if adjustedTotal is greater than $500, increase membership
        if (adjustedTotal > 500) {
            if (loyaltyMemberStatus == "Silver") {
                loyaltyMemberStatus = "Gold";
            } else if (loyaltyMemberStatus == "Gold") {
                loyaltyMemberStatus = "Platinum";
            }
        }
        System.out.println(loyaltyMemberStatus);

        // user name and password
        String userName = "Tommy123";
        String password = "12345";

        if (userName.equals("Tommy123") && password.equals("12345")) {
            System.out.println("login successful");
        } else {
            System.out.println("Access denied");
        }

        // for loop - print each number 0-9
        System.out.println("numbers 0-10");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // for loop 10-0 backwards
        System.out.println("10-0 backwards");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        // for loop evens 0-100
        System.out.println("evens 0-100");
        for (int i = 0; i < 101; i += 2) {
            System.out.println(i);
        }

        // for loop print even and odd
        System.out.println("print even and odd");
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "even");
            } else {
                System.out.println(i + "odd");
            }
        }

        // while loop 100 to 0 backwards, divide by 3, print remainder
        System.out.println("divide by 3");
        int i = 100;
        while (i > 0) {
            System.out.println(i + " " + i % 3);
            i--;
        }

        // the ending brackets
    }
}