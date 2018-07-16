/**
 * Created by nirellria on 16/07/18.
 */
import java.util.Scanner;
    public class QuartsToGallonsInteractive {
        public static void main(String[] args)
        {
            final int QUARTS = 4;
            int quartsRequired = 0, gallonsNeeded, extraQuartsNeeded;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter quarts needed >> ");
            quartsRequired = input.nextInt();
            gallonsNeeded = quartsRequired / QUARTS;
            extraQuartsNeeded = quartsRequired % QUARTS;
            System.out.println("The job that needs " + quartsRequired +
                    " quarts requires " + gallonsNeeded + " gallons plus " +
                    extraQuartsNeeded + " quarts.");
        }
    }

