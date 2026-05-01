package application.services;

import domain.model.DateRange;

import java.util.List;

public interface YahooFinanceClient {
    List<String> fetchRawPrices(String symbol, DateRange range);
}
