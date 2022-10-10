import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group? ");
        int people = scan.nextInt();
        System.out.println("What's the tip percentage? (0-100) ");
        double tip = scan.nextDouble();
        TipCalculator calc1 = new TipCalculator(people, tip);

        int x = 0;
        while (x <  people)
        {
            System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            double cost = scan.nextDouble();
            calc1.addMeal(cost);
            x++;
        }


        System.out.println("----------------------------------------");
        System.out.println("Total Bill Before Tip: $" + calc1.getTotalBillBeforeTip());
        System.out.println("Tip Percentage: " + calc1.getTipPercentage() + "%");
        System.out.println("Total Tip: $" + calc1.tipAmount());
        System.out.println("Total Bill With Tip: $" + calc1.totalBill());
        System.out.println("Per Person Cost Before Tip: $" + calc1.perPersonCostBeforeTip());
        System.out.println("Tip Per Person: $" + calc1.perPersonTipAmount());
        System.out.println("Total Cost Per Person: $" + calc1.perPersonTotalCost());


    }
}
