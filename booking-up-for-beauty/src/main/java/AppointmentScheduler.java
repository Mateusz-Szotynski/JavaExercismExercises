import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        var formatter = DateTimeFormatter.ofPattern("MM/dd/uuuu HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        return String.format("You have an appointment on %s, %s %d, %d, at %s.",
                appointmentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH),
                appointmentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH),
                appointmentDate.getDayOfMonth(),
                appointmentDate.getYear(),
                appointmentDate.format(DateTimeFormatter.ofPattern("h:mm a")).toUpperCase(Locale.ROOT));
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
