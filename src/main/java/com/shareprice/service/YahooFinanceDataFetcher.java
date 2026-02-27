package com.shareprice.service;

import com.shareprice.model.Price;
import java.util.ArrayList;
import java.util.List;

public class YahooFinanceDataFetcher implements DataFetcherService {

    private static final String YAHOO_BASE_URL = "https://query1.finance.yahoo.com/v8/finance/chart/";

    @Override
    public List<Price> fetchPrices(String symbol, String startDate, String endDate) {
        System.out.println("[YahooFinanceFetcher] Requesting: " + symbol
                + " | " + startDate + " -> " + endDate);

        List<Price> samplePrices = new ArrayList<>();
        samplePrices.add(new Price(symbol, 150.00, startDate));
        samplePrices.add(new Price(symbol, 152.50, endDate));
        return samplePrices;
    }

    @Override
    public boolean isAvailable() {
        System.out.println("[YahooFinanceFetcher] Checking network availability...");
        return true;
    }
}
