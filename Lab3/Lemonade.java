package week3_methods;


import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class Lemonade {


    public static void main(String[] args) {

        // Calculate operating cost and profit for a lemonade stand.
        // The lemonade stand sells lemonade, and cookies too.

        // To calculate profit, need to know how much was spent on lemonade supplies, what one cup of
        // lemonade sold for, and the number of cups sold.
        double lemonadeProfit = calculateProfitForProduct(" lemonade ");
        System.out.println("Lemonade profit = $" + lemonadeProfit);

        // Do same calculation for cookies

        // To calculate profit, need to know how much was spent on cookie supplies, what one cookie
        // sold for, and the number of cookies sold.
       double cookieProfit = calculateProfitForProduct(" cookies ");
        System.out.println("Cookie profit = $" + cookieProfit);

        double chipsProfit = calculateProfitForProduct(" chips ");
        System.out.println("Chips profit = $" + chipsProfit);


    }

    public static double calculateProfitForProduct(String productName){
        double suppliesCost = doubleInput("How much did you spend on " + productName + "supplies");
        double salesPrice = doubleInput("What did you sell one " + productName + " for?");
        int numberSold = intInput("How many cups of " + productName + " did you sell");

        // Calculate profit

        double profit = ( numberSold * salesPrice ) - suppliesCost;
        return profit;
    }
}

