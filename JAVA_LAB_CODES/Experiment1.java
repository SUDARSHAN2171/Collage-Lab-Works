
// Write a program to find out day of the given date using Command line argument.
import java.util.Scanner;

public class Experiment1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter the day (dd): ");
        int dd = scanner.nextInt();

        System.out.println("Enter the month (mm): ");
        int mm = scanner.nextInt();

        System.out.println("Enter the year (yyyy): ");
        int yy = scanner.nextInt();

        int m_day[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Check for leap year and adjust February days
        if ((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0)) {
            m_day[2] = 29;
        }

        // Validate the entered date
        if (mm < 1 || mm > 12) {
            System.out.println("Invalid date: Month must be between 1 and 12");
            return;
        }

        if (dd < 1 || dd > m_day[mm]) {
            System.out.println("Invalid date: Day must be between 1 and " + m_day[mm]);
            return;
        }

        // Calculate the number of days passed in the current year
        int day_passed = dd;
        for (int i = 1; i < mm; i++) {
            day_passed += m_day[i];
        }

        // Calculate the number of days in the complete years
        int total_days = (yy - 1) * 365 + (yy - 1) / 4 - (yy - 1) / 100 + (yy - 1) / 400 + day_passed;

        // Find the day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        int t_odddays = total_days % 7;

        // Print the number of odd days and the corresponding day of the week
        System.out.println("Number of odd days are " + t_odddays);

        switch (t_odddays) {
            case 0:
                System.out.println("The day is Sunday");
                break;
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thursday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
                System.out.println("The day is Saturday");
                break;
        }

        scanner.close();
    }
}
