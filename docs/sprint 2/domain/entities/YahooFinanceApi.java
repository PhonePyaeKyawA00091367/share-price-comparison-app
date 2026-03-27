package infrastructure.api;

import domain.entities.DateRange;
import domain.interfaces.IMarketDataProvider;

import java.util.ArrayList;
import java.util.List;

public class YahooFinanceApi implements IMarketDataProvider {

    @Override
    public List<String> getRawPrices(String symbol, DateRange dateRange) {
        List<String> raw = new ArrayList<>();
        raw.add("2024-01-01,100.0,USD");
        raw.add("2024-01-02,104.5,USD");
        raw.add("2024-01-03,107.2,USD");
        return raw;
    }
}
