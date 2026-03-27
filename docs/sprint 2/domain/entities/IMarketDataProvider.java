package domain.interfaces;

import domain.entities.DateRange;

import java.util.List;

public interface IMarketDataProvider {
    List<String> getRawPrices(String symbol, DateRange dateRange);
}
