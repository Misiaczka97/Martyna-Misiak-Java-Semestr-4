import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.stream.Collectors;

public class TimeZoneOffsets {
    public static void main(String[] args) {
        // Uzyskanie bieżącej daty i czasu
        LocalDateTime now = LocalDateTime.now();

        // Uzyskanie wszystkich dostępnych stref czasowych
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        // Przekształcenie zbioru stref czasowych na strumień
        zoneIds.stream()
                // Mapowanie każdej strefy czasowej na jej nazwę i przesunięcie czasowe
                .map(zoneId -> {
                    ZoneId zone = ZoneId.of(zoneId);
                    ZonedDateTime zonedDateTime = now.atZone(zone);
                    String offset = zonedDateTime.getOffset().getId();
                    return String.format("%s: %s", zoneId, offset);
                })
                // Sortowanie stref czasowych alfabetycznie
                .sorted()
                // Zbieranie wyników i wypisanie każdej strefy czasowej z przesunięciem
                .forEach(System.out::println);
    }
}
