package domain.model;

import java.time.LocalDate;

public class SharePrice {
    private final LocalDate date;
    private final double closePrice;

    public SharePrice(LocalDate date, double closePrice) {
        this.date = date;
        this.closePrice = closePrice;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getClosePrice() {
        return closePrice;
    }

    @Override
    public String toString() {
        return date + " : " + closePrice;
    }
}
