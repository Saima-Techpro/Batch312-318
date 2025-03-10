package practices.day05;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class C08_DateTimeFormatter {
    public static void main(String[] args) {
        //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy | HH:mm");

        LocalDateTime rightNow = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateTimeFormatter.format(rightNow));
    }
}
