import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FlightArrival {
    public static void main(String[] args) {
        // Czas rozpoczęcia lotu w Los Angeles
        ZoneId losAngelesZone = ZoneId.of("America/Los_Angeles");
        LocalDateTime departureLocal = LocalDateTime.of(2024, 6, 27, 15, 5); // 3:05 PM, 27 czerwca 2024
        ZonedDateTime departureZoned = ZonedDateTime.of(departureLocal, losAngelesZone);

        // Czas trwania lotu
        Duration flightDuration = Duration.ofHours(10).plusMinutes(50);

        // Strefa czasowa we Frankfurcie
        ZoneId frankfurtZone = ZoneId.of("Europe/Berlin");

        // Obliczanie czasu przybycia
        ZonedDateTime arrivalZoned = departureZoned.plus(flightDuration).withZoneSameInstant(frankfurtZone);

        // Wyświetlanie wyniku
        System.out.println("Departure time in Los Angeles: " + departureZoned);
        System.out.println("Arrival time in Frankfurt: " + arrivalZoned);
    }
}

