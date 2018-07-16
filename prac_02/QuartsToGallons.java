/**
 * Created by nirellria on 16/07/18.
 */
public class QuartsToGallons {
    public static void main(String args[])
    {
        int quarts, gallon, result;
        quarts = 18;
        gallon = 4;
        result = quarts/gallon;
        System.out.println("The job that needs "+ quarts + " quarts requires " + result + " gallons " + " plus " + (quarts-gallon*result) + " quarts");
    }
}