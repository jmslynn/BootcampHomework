public class App {
    public static void main(String[] args) throws Exception {
        // Jennifer Lynn homework week 2

        // question 2, boolean variables
        boolean isHotOutside = false;
        boolean isWeekday = true;
        boolean hasMoneyInPocket = false;

        // question 3, other variables
        double costOfMilk = 2.95;
        double moneyInWallet = 47.50;
        int thirstLevel = 4;

        // question 4, boolean scenarios
        boolean shouldBuyIceCream = isHotOutside && hasMoneyInPocket;
        System.out.println(shouldBuyIceCream);

        boolean willGoSwimming = isHotOutside && !isWeekday;
        System.out.println(willGoSwimming);

        boolean isAGoodDay = isHotOutside && moneyInWallet > 0 && !isWeekday;
        System.out.println(isAGoodDay);

        boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && costOfMilk * 2 <= moneyInWallet;
        System.out.println(willBuyMilk);

        // closing brackets
    }
}
