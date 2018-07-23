/**
 * Created by nirellria on 21/07/18.
 */
import java.util.Scanner;
public class ChiliToGoProfit {

    public static void main(String[] args)
    {
        final double ADULT_PRICE = 7;
        final double ADULT_COST = 4.35;
        final double CHILD_PRICE = 4;
        final double CHILD_COST = 3.10;
        int mealAdult ;
        int mealChild ;
        double totalAdult;
        double totalChild;
        double finalTotal;
        double profitAdult, profitChild, totalProfit;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of adult meals ordered : ");
        mealAdult = input.nextInt();
        System.out.print("Enter number of child meals ordered : ");
        mealChild  = input.nextInt();
        totalAdult = mealAdult * ADULT_PRICE;
        totalChild = mealChild  * CHILD_PRICE;
        finalTotal = totalAdult + totalChild;
        profitAdult = totalAdult - (mealAdult * ADULT_COST);
        profitChild = totalChild - (mealChild  * CHILD_COST);
        totalProfit = profitAdult + profitChild;
        System.out.println(mealAdult + " adult meals were ordered at " + ADULT_PRICE + " each.");
        System.out.println("      Total is " + totalAdult);

        System.out.println(mealChild  + " child meals were ordered at " + CHILD_PRICE + " each.");
        System.out.println("      Total is " + totalChild);

        System.out.println("Grand total for all meals is " + finalTotal);
        System.out.println("Profits:");

        System.out.println("      Adult profit is " + profitAdult);
        System.out.println("      Child profit is " + profitChild);
        System.out.println("Total profit is " + totalProfit);
    }
}