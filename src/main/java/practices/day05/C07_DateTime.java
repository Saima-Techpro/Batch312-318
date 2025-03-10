package practices.day05;

import java.time.LocalDateTime;

public class C07_DateTime {
    public static void main(String[] args) {
        /*
        TASK 1:
        - Print today's date using an object.
        - Print which day of the year we are currently on.
        - Print which day we are on.
        - Print how many days left for this year to end.
        - Print the date that is 3 years 5 months 7 days later than today.
        - Print the day of month of the date that is 2 years 2 months 2 days later than today.
        - Print the day of week of the date that is 7 years 7 months 7 days later than today.
        - Create a second date object, get the information from the user.
        Compare it with today's date and print the older one.
         */

        /*
        LocalDate -> just date
        LocalTime -> just time
        LocalDateTime -> Both date and time
         */
/*

        //step 1
        LocalDate todaysDate = LocalDate.now();
        System.out.println(todaysDate);

        //step 2
        System.out.println(todaysDate.getDayOfYear());

        //step 3
        System.out.println(todaysDate.getDayOfWeek());

        //step 4
        if (todaysDate.isLeapYear()){
            System.out.println(366 - todaysDate.getDayOfYear());
        }else {
            System.out.println(365 - todaysDate.getDayOfYear());
        }

        System.out.println(todaysDate.lengthOfYear() - todaysDate.getDayOfYear());

        //step 5
        System.out.println(todaysDate.plusYears(3)
                .plusMonths(5).plusDays(7));

        //step 6
        System.out.println(todaysDate.plusYears(2)
                .plusMonths(2).plusDays(2).getDayOfMonth());
        //step 7
        System.out.println(todaysDate.plusYears(7)
                .plusMonths(7).plusDays(7). getDayOfWeek());

        //step 8
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a year:");
        Integer year = input.nextInt();
        input.nextLine();

        System.out.println("Please enter a month:");
        Integer month = input.nextInt();
        input.nextLine();

        System.out.println("Please enter a day:");
        Integer day = input.nextInt();
        input.nextLine();

        LocalDate newDate = LocalDate.of(year, month, day);

        if (newDate.isBefore(todaysDate)){
            System.out.println(newDate);
        } else if(newDate.isAfter(todaysDate)){
            System.out.println(todaysDate);
        }else {
            System.out.println("The dates you provided are the same.");
        }
*/

        /*
        TASK 2 HW:
        - Print the hour and minute of right now.
        - Print the seconds of right now.
        - Print the time at 10 thousand seconds ago.
        - Print the hour at 200 minutes ago
        - Print the time with only the hour changed to 3, keeping minutes and seconds the same.
         */

        LocalDateTime now = LocalDateTime.now();

        System.out.println(now.getHour() + ":" + now.getMinute());
        System.out.println(now.getSecond());

        System.out.println("Time 10000 seconds ago: " + now.minusSeconds(10_000));

        System.out.println("Time 200 minutes ago: " + now.minusMinutes(200));

        System.out.println("Time with hour changed to 3: " + now.withHour(3));

        /*
        TASK 3 HW:
        - Print the date and time of 3 months and 100 hours later.
        - Print the date of 100 days ago and 100 days later.
        - Print the day of week of the date that is 3 years 5 months 7 days 1000 hours later than today.
        - Do all of these using LocalDateTime.
         */

        System.out.println("Time with 3 months and 100 hours added: " +now.plusMonths(3).plusHours(100));

        System.out.println("Date 100 days ago: " + now.minusDays(100).toLocalDate());
        System.out.println("Date 100 days later: " + now.plusDays(100).toLocalDate());

        System.out.println("DoW for 3 years 5 months 7 days 1000 hours later: " + now.plusYears(3).plusMonths(5).plusDays(7).plusHours(1000).getDayOfWeek());
    }
}
