package com.shareprice.model;

public class Price {
    private String symbol;
    private double value;
    private String date;

    public Price(String symbol, double value, String date) {
        this.symbol = symbol;
        this.value = value;
        this.date = date;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getValue() {
        return value;
    }

    public String getDate() {
        return date;
    }
}

