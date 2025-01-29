import java.io.*;
import java.time.*;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
class Event {
    private String name;
    private LocalDateTime dateTime;
    private Duration duration;
    public Event(String name, LocalDateTime dateTime, Duration duration) {
        this.name = name;
        this.dateTime = dateTime;
        this.duration = duration;
    }
    public String getName() {
        return name;
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public Duration getDuration() {
        return duration;
    }
    @Override
    public String toString() {
        return "\"" + name + "\", " + dateTime + ", " + duration.toHours() + " hours";
    }
}
public class DateAndTimeAPI {
    public static void main(String[] args) {
        List<Event> events = List.of(
                new Event("Meeting", LocalDateTime.of(2025, 1, 28, 10, 0), Duration.ofHours(1)),
                new Event("Workshop", LocalDateTime.of(2025, 1, 28, 13, 0), Duration.ofHours(2)),
                new Event("Conference", LocalDateTime.of(2025, 1, 29, 9, 30), Duration.ofHours(3))
        );
        LocalDate filterDate = LocalDate.of(2025, 1, 28);
        List<Event> filteredEvents = events.stream()
                .filter(event -> event.getDateTime().toLocalDate().equals(filterDate))
                .collect(Collectors.toList());
        System.out.println("Events on " + filterDate + ":");
        filteredEvents.forEach(event -> System.out.println(event.getName()));
        if (events.size() > 1) {
            Duration gap = Duration.between(events.get(0).getDateTime().plus(events.get(0).getDuration()),
                    events.get(1).getDateTime());
        }
    }
}
