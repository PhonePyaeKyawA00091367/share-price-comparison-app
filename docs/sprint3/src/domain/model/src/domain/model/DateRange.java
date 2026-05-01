package domain.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateRange {
    private final LocalDate startDate;
    private final LocalDate endDate;

    public DateRange(LocalDate startDate, LocalDate endDate) {
        if (endDate.isBefore(startDate)) {
            throw new IllegalArgumentException("End date cannot be before start date.");
        }

        if (ChronoUnit.YEARS.between(startDate, endDate) > 2) {
            throw new IllegalArgumentException("Date range cannot exceed two years.");
        }

        this.startDate = startDate;
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}
