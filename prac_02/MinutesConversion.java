/**
 * Created by nirellria on 21/07/18.
 */
import java.util.Scanner;
public class MinutesConversion {

    public static void main(String[] args)
    {
        int minutes;
        double hours;
        double days;
        double HOURS_IN_DAY = 24;
        double MINUTES_IN_HR = 60;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter minutes : ");
        minutes = input.nextInt();
        hours = minutes / MINUTES_IN_HR;
        days = hours / HOURS_IN_DAY;
        System.out.println(minutes + " minutes is equal to " + hours + " hours or " + days + " days.");
    }
}
