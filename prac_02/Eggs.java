/**
 * Created by nirellria on 21/07/18.
 */
import java.util.Scanner;
public class Eggs {
    public static void main(String[] args)
    {
        final double PRICE_PER_EGG = 0.45;
        final double PRICE_PER_DOZEN = 3.25;
        final int DOZEN = 12;
        int eggs;
        int dozens;
        int leftOver;
        double total;
        Scanner input = new Scanner(System.in);
        System.out.print("Eggs needed : ");
        eggs = input.nextInt();
        dozens = eggs / DOZEN;
        leftOver = eggs % DOZEN;
        total = dozens * PRICE_PER_DOZEN + leftOver * PRICE_PER_EGG;
        System.out.println("You ordered " + eggs + " eggs. That's " +
                dozens + " dozen at $" + PRICE_PER_DOZEN +
                " per dozen and " + leftOver + " loose eggs at " +
                (int) (PRICE_PER_EGG * 100) + " cents each for a total of $" + total);
    }
}
