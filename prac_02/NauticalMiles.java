/**
 * Created by nirellria on 16/07/18.
 */
public class NauticalMiles {
        public static void main(String[] args)
        {
            final double KM_IN_NAUTICAL_MILE = 1.852;
            final double MILES_IN_NAUTICAL_MILE = 1.150779;
            int nauticalMiles = 200;
            double km;
            double miles;
            km = nauticalMiles * KM_IN_NAUTICAL_MILE;
            miles = nauticalMiles * MILES_IN_NAUTICAL_MILE;
            System.out.println(nauticalMiles + " nautical miles equals " +
                    km + " kilometers or " + miles + " miles.");
        }
    }
