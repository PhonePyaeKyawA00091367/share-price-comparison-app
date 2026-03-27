package domain.entities;

import java.time.LocalDate;

public class SharePrice {
    private final LocalDate date;
    private final double closePrice;
    private final Currency currency;

    public SharePrice(LocalDate date, double closePrice, Currency currency) {
        if (date == null || currency == null) {
            throw new IllegalArgumentException("Date and currency cannot be null.");
        }
        this.date = date;
        this.closePrice = closePrice;
        this.currency = currency;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getClosePrice() {
        return closePrice;
    }

    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return date + " : " + closePrice + " " + currency;
    }
}
