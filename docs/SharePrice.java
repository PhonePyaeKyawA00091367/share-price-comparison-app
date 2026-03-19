package entities;

public class SharePrice {
    private String date;
    private double price;

    public SharePrice(String date, double price) {
        this.date = date;
        this.price = price;
    }

    public String getDate() { return date; }
    public double getPrice() { return price; }
}
