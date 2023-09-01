import java.time.Month;

import static Utils.SeasonCalendarLogic.getSeason;

public class Main {
    public static void main(String[] args) {
        // Get the current month using the java.time.Month enum
        Month currentMonth = Month.values()[java.time.LocalDate.now().getMonthValue() -1];

        // Determine the season based on the current month
        String season = getSeason(currentMonth);

        // Display the result to the user
        System.out.println("The current month is " + currentMonth.toString().toLowerCase() + ".");
        System.out.println("It falls under the season of " + season + ".");
    }
}