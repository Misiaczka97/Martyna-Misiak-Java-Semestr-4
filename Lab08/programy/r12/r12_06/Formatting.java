package r12.r12_06;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.util.Locale;

public class Formatting
{
    public static void main(String[] args)
    {
        System.out.println();
        ZonedDateTime apollo11launch = ZonedDateTime.of(1969, 7, 16, 9, 32, 0, 0,
                                       ZoneId.of("America/New_York"));
        
        System.out.println();
        String formatted = DateTimeFormatter.ISO_DATE_TIME.format(apollo11launch);
        // 1969-07-16T09:32:00-05:00[America/New_York]
        System.out.println(formatted);

        System.out.println();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        formatted = formatter.format(apollo11launch);
        // July 16, 1969 9:32:00 AM EDT
        System.out.println(formatted);

        System.out.println();
        formatted = formatter.withLocale(Locale.FRENCH).format(apollo11launch);
        // 16 juillet 1969 09:32:00 EDT
        System.out.println(formatted);
        
        System.out.println();
        formatter = DateTimeFormatter.ofPattern("E yyyy-MM-dd HH:mm");
        formatted = formatter.format(apollo11launch);
        System.out.println(formatted);
        
        System.out.println();
        LocalDate churchsBirthday = LocalDate.parse("1903-06-14");
        System.out.println("otwarcieKościoła: " + churchsBirthday);
        
        System.out.println();
        apollo11launch =
            ZonedDateTime.parse("1969-07-16 03:32:00-0400",
                                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssxx"));
        System.out.println("startApollo11: " + apollo11launch);
        
        System.out.println();
        for (DayOfWeek w : DayOfWeek.values()) {
            System.out.print(w.getDisplayName(TextStyle.SHORT, Locale.ENGLISH) + " ");
        }
        
        System.out.println();
        for (DayOfWeek w : DayOfWeek.values()) {
            System.out.print(w.getDisplayName(TextStyle.SHORT, Locale.getDefault()) + " ");
        }
        System.out.println();
    }
}
