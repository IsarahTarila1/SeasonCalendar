package Utils;

import java.time.Month;
import java.util.Scanner;

public class SeasonCalendarLogic {
    public static String getSeason(Month month) {
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return "Winter";
            case MARCH:
            case APRIL:
            case MAY:
                return "Spring";
            case JUNE:
            case JULY:
            case AUGUST:
                return "Summer";
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return "Autumn";
            default:
                return "Unknown";
        }
    }
}

