public class Experiment1 {
    public static void main(String args[]) {
        // Ensure the program takes exactly 3 arguments
        if (args.length != 3) {
            System.out.println("Please provide the date in the format: dd mm yyyy");

            return;
        }

        int dd = Integer.parseInt(args[0]);
        int mm = Integer.parseInt(args[1]);
        int yy = Integer.parseInt(args[2]);

        int m_day[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Check for leap year and adjust February days
        if ((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0)) {
            m_day[2] = 29;
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
    }
}