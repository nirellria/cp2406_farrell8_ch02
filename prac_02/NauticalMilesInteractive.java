/**
 * Created by nirellria on 16/07/18.
 */
import java.util.Scanner;
public class NauticalMilesInteractive {
    public static void main(String[] args) {
        final double KM_IN_NAUTICAL_MILE = 1.852;
        final double MILES_IN_NAUTICAL_MILE = 1.150779;
        double kilometers;
        double nauticalMiles;
        double miles;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of nautical miles : ");
        nauticalMiles = input.nextDouble();
        kilometers = nauticalMiles * KM_IN_NAUTICAL_MILE;
        miles = nauticalMiles * MILES_IN_NAUTICAL_MILE;
        System.out.println(nauticalMiles + " nautical miles is " + miles + " miles " +
                kilometers + " kilometers.");
    }
}
