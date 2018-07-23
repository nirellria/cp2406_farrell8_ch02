/**
 * Created by nirellria on 21/07/18.
 */
import java.util.Scanner;
public class InchesToFeetInteractive {
        public static void main(String[] args) {
            final int INCHES_IN_FOOT = 12;
            int feet;
            int inches;
            int inchesLeft;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter inches : ");
            inches = input.nextInt();
            feet = inches / INCHES_IN_FOOT;
            inchesLeft = inches % INCHES_IN_FOOT;
            System.out.println(inches + " inches is equal to " +
                    feet + " feet and " + inchesLeft + " inches");
        }
    }
