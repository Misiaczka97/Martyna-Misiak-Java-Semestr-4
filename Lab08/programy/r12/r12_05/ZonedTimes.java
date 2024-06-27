package r12.r12_05;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedTimes
{
    public static void main(String[] args)
    {
        System.out.println();
        ZonedDateTime apollo11launch = ZonedDateTime.of(1969, 7, 16, 9, 32, 0, 0,
                                       ZoneId.of("America/New_York"));
        // 1969-07-16T09:32-04:00[America/New_York]
        System.out.println("startApollo11: " + apollo11launch);
        
        System.out.println();
        Instant instant = apollo11launch.toInstant();
        System.out.println("startApollo11-instant: " + instant);
        
        System.out.println();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("UTC"));
        System.out.println("startApollo11-zonedDateTime-UTC: " + zonedDateTime);
        
        System.out.println();
        ZonedDateTime skipped = ZonedDateTime.of(
                                    LocalDate.of(2013, 3, 31),
                                    LocalTime.of(2, 30),
                                    ZoneId.of("Europe/Warsaw"));
        // Tworzy 31. marca, 3:30
        System.out.println("ominięte: " + skipped);
        
        System.out.println();
        ZonedDateTime ambiguous = ZonedDateTime.of(
                                      LocalDate.of(2013, 10, 27),
                                      // Koniec czasu letniego
                                      LocalTime.of(2, 30),
                                      ZoneId.of("Europe/Berlin"));
        // 2013-10-27T02:30+02:00[Europe/Berlin]
        ZonedDateTime anHourLater = ambiguous.plusHours(1);
        // 2013-10-27T02:30+01:00[Europe/Berlin]
        System.out.println("niejednoznaczne: " + ambiguous);
        System.out.println("godzinęPóźniej: " + anHourLater);
        
        System.out.println();
        ZonedDateTime meeting = ZonedDateTime.of(
                                    LocalDate.of(2013, 10, 31),
                                    LocalTime.of(14, 30),
                                    ZoneId.of("America/Los_Angeles"));
        System.out.println("spotkanie: " + meeting);
        
        System.out.println();
        ZonedDateTime nextMeeting = meeting.plus(Duration.ofDays(7));
        // Caution! Will not work with daylight savings time
        System.out.println("kolejneSpotkanie-duration: " + nextMeeting);
        System.out.println();
        nextMeeting = meeting.plus(Period.ofDays(7)); // OK
        System.out.println("kolejneSpotkanie-period: " + nextMeeting);
        System.out.println();
        nextMeeting = meeting.plusSeconds(604800); // OK
        System.out.println("kolejneSpotkanie-seconds: " + nextMeeting);
        System.out.println();
    }
}
