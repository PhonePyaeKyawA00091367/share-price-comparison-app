package domain.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stock {
    private final String symbol;
    private final String companyName;
    private final List<SharePrice> sharePrices = new ArrayList<>();

    public Stock(String symbol, String companyName) {
        if (symbol == null || symbol.isBlank()) {
            throw new IllegalArgumentException("Symbol cannot be empty.");
        }
        this.symbol = symbol.toUpperCase();
        this.companyName = companyName == null ? "" : companyName;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void addPrice(SharePrice sharePrice) {
        if (sharePrice != null) {
            sharePrices.add(sharePrice);
        }
    }

    public void setPrices(List<SharePrice> prices) {
        sharePrices.clear();
        if (prices != null) {
            sharePrices.addAll(prices);
        }
    }

    public List<SharePrice> getSharePrices() {
        return Collections.unmodifiableList(sharePrices);
    }

    @Override
    public String toString() {
        return symbol + " - " + companyName;
    }
}
