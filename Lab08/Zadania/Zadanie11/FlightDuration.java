import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FlightDuration {
    public static void main(String[] args) {
        // Czas rozpoczęcia lotu we Frankfurcie
        ZoneId frankfurtZone = ZoneId.of("Europe/Berlin");
        LocalDateTime departureLocal = LocalDateTime.of(2024, 6, 27, 14, 5); // 2:05 PM, 27 czerwca 2024
        ZonedDateTime departureZoned = ZonedDateTime.of(departureLocal, frankfurtZone);

        // Czas zakończenia lotu w Los Angeles
        ZoneId losAngelesZone = ZoneId.of("America/Los_Angeles");
        LocalDateTime arrivalLocal = LocalDateTime.of(2024, 6, 27, 16, 40); // 4:40 PM, 27 czerwca 2024
        ZonedDateTime arrivalZoned = ZonedDateTime.of(arrivalLocal, losAngelesZone);

        // Obliczanie czasu trwania lotu
        Duration flightDuration = Duration.between(departureZoned, arrivalZoned);

        // Wyświetlanie wyniku
        long hours = flightDuration.toHours();
        long minutes = flightDuration.toMinutes() % 60;
        System.out.println("Departure time in Frankfurt: " + departureZoned);
        System.out.println("Arrival time in Los Angeles: " + arrivalZoned);
        System.out.println("Flight duration: " + hours + " hours and " + minutes + " minutes");
    }
}
