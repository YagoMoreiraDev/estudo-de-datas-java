package enum_dayofweek;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        DayOfWeek day1 = DayOfWeek.MONDAY;
        DayOfWeek day2 = DayOfWeek.TUESDAY;
        DayOfWeek day3 = DayOfWeek.WEDNESDAY;
        DayOfWeek day4 = DayOfWeek.THURSDAY;
        DayOfWeek day5 = DayOfWeek.FRIDAY;
        DayOfWeek day6 = DayOfWeek.SATURDAY;
        DayOfWeek day7 = DayOfWeek.SUNDAY;

        DayOfWeek day8 = day7.plus(3);
        DayOfWeek day9 = DayOfWeek.of(5);

        System.out.println(day8);
        System.out.println(day9);
    }
}
