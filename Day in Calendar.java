// This program takes current date from the user in MM/DD/YY format and returns Day of the week using Calendar class

import java.util.Calendar;
import java.util.Scanner;

public class DayOfWeekCalculator {
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month - 1); 
        c.set(Calendar.DAY_OF_MONTH, day);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        String dayOfWeekString;
        switch (dayOfWeek) {
            case 1:
                dayOfWeekString = "SUNDAY";
                break;
            case 2:
                dayOfWeekString = "MONDAY";
                break;
            case 3:
                dayOfWeekString = "TUESDAY";
                break;
            case 4:
                dayOfWeekString = "WEDNESDAY";
                break;
            case 5:
                dayOfWeekString = "THURSDAY";
                break;
            case 6:
                dayOfWeekString = "FRIDAY";
                break;
            case 7:
                dayOfWeekString = "SATURDAY";
                break;
            default:
                dayOfWeekString = "INVALID";
                break;
        }
        System.out.println("The day of the week for " + day + "/" + month + "/" + year + " is " + dayOfWeekString);
    }
}
