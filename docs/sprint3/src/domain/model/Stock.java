package domain.model;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private final String symbol;
    private final String companyName;
    private List<SharePrice> prices;

    public Stock(String symbol, String companyName) {
        this.symbol = symbol;
        this.companyName = companyName;
        this.prices = new ArrayList<>();
    }

    public String getSymbol() {
        return symbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public List<SharePrice> getPrices() {
        return prices;
    }

    public void setPrices(List<SharePrice> prices) {
        this.prices = prices;
    }
}
