import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpcomingMeetings {
    static class Meeting {
        String description;
        ZonedDateTime startTime;

        Meeting(String description, ZonedDateTime startTime) {
            this.description = description;
            this.startTime = startTime;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Meeting> meetings = new ArrayList<>();

        // Wczytywanie spotkań od użytkownika
        System.out.println("Enter the number of meetings:");
        int numberOfMeetings = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm z");

        for (int i = 0; i < numberOfMeetings; i++) {
            System.out.println("Enter meeting description:");
            String description = scanner.nextLine();
            System.out.println("Enter meeting start time (format: yyyy-MM-dd HH:mm z):");
            String startTimeStr = scanner.nextLine();

            ZonedDateTime startTime = ZonedDateTime.parse(startTimeStr, formatter);
            meetings.add(new Meeting(description, startTime));
        }

        // Pobieranie bieżącego czasu
        ZonedDateTime now = ZonedDateTime.now();

        // Wyszukiwanie spotkań rozpoczynających się w ciągu najbliższej godziny
        System.out.println("Meetings starting within the next hour:");
        for (Meeting meeting : meetings) {
            long minutesUntilStart = java.time.Duration.between(now, meeting.startTime).toMinutes();
            if (minutesUntilStart >= 0 && minutesUntilStart <= 60) {
                System.out.println(meeting.description + " at " + meeting.startTime.format(formatter));
            }
        }
    }
}
