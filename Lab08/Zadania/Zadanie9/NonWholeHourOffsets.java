import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.stream.Collectors;

public class NonWholeHourOffsets {
    public static void main(String[] args) {
        // Uzyskanie bieżącej daty i czasu
        LocalDateTime now = LocalDateTime.now();

        // Uzyskanie wszystkich dostępnych stref czasowych
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        // Przekształcenie zbioru stref czasowych na strumień
        Set<String> nonWholeHourOffsets = zoneIds.stream()
                // Mapowanie każdej strefy czasowej na jej przesunięcie czasowe
                .map(zoneId -> {
                    ZoneId zone = ZoneId.of(zoneId);
                    ZonedDateTime zonedDateTime = now.atZone(zone);
                    return String.format("%s: %s", zoneId, zonedDateTime.getOffset().getId());
                })
                // Filtrowanie stref czasowych, których przesunięcia nie są pełnymi godzinami
                .filter(zoneOffset -> {
                    String offset = zoneOffset.split(": ")[1];
                    return !offset.matches("Z|[+-](0[0-9]|1[0-4]):00");
                })
                // Sortowanie stref czasowych alfabetycznie
                .sorted()
                // Zbieranie wyników do zbioru
                .collect(Collectors.toSet());

        // Wypisanie wyników
        nonWholeHourOffsets.forEach(System.out::println);
    }
}
