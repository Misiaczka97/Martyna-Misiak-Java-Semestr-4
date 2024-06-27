import java.time.LocalTime;

public class TimeInterval {
    private LocalTime startTime;
    private LocalTime endTime;

    // Konstruktor klasy TimeInterval
    public TimeInterval(LocalTime startTime, LocalTime endTime) {
        if (startTime.isAfter(endTime)) {
            throw new IllegalArgumentException("Start time must be before end time");
        }
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Metoda do sprawdzenia, czy dwa odcinki czasu nakładają się na siebie
    public boolean overlaps(TimeInterval other) {
        return !(this.endTime.isBefore(other.startTime) || this.startTime.isAfter(other.endTime));
    }

    // Gettery
    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    // Przykład użycia klasy TimeInterval
    public static void main(String[] args) {
        TimeInterval meeting1 = new TimeInterval(LocalTime.of(10, 0), LocalTime.of(11, 0));
        TimeInterval meeting2 = new TimeInterval(LocalTime.of(10, 30), LocalTime.of(11, 30));
        TimeInterval meeting3 = new TimeInterval(LocalTime.of(11, 30), LocalTime.of(12, 30));

        System.out.println("Meeting 1 overlaps with Meeting 2: " + meeting1.overlaps(meeting2)); // true
        System.out.println("Meeting 1 overlaps with Meeting 3: " + meeting1.overlaps(meeting3)); // false
    }
}
