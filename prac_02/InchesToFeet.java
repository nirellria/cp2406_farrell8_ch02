/**
 * Created by nirellria on 16/07/18.
 */
public class InchesToFeet
    {
        public static void main (String[] args)
        {
            final int INCHES_IN_FOOT = 12;
            int inches = 86;
            int feet;
            int inchesLeft;
            feet = inches / INCHES_IN_FOOT;
            inchesLeft = INCHES_IN_FOOT % inches;
            System.out.println(inches + " becomes " +
                    feet + " feet and " + inchesLeft + " inches");
        }
    }