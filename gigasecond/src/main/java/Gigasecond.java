import java.math.BigInteger;
import java.time.*;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;

public class Gigasecond {

    private LocalDateTime dateTime;

    private static final long GIGASECOND = 1000000000L;
    private static final Duration duration = Duration.ofSeconds(GIGASECOND);

    public Gigasecond(LocalDate moment) {
        LocalDateTime localDateTime = LocalDateTime.of(moment, LocalTime.MIDNIGHT);
        dateTime = LocalDateTime.from(localDateTime.plus(duration));
    }

    public Gigasecond(LocalDateTime moment) {
        dateTime = LocalDateTime.from(moment.plus(duration));
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
