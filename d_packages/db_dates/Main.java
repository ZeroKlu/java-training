package d_packages.db_dates;

// import java.time.LocalDate;
// import java.time.LocalTime;
// import java.time.LocalDateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;

/*
 Java Dates
    Class	            Description
    LocalDate	        Represents a date (year, month, day (yyyy-MM-dd))
    LocalTime	        Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
    LocalDateTime	    Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
    DateTimeFormatter	Formatter for displaying and parsing date-time objects
 */

public class Main {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);

        ZonedDateTime myDateTimeWithZone = ZonedDateTime.now();
        // To get the full day name, use 'EEEE'
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("E, MM-dd-yyyy h:mm:ss z");
        String myFormattedDateTime = myDateTimeWithZone.format(myFormat);
        System.out.println(myFormattedDateTime);
    }
}
