package com.shareprice.service;

import com.shareprice.model.Price;
import com.shareprice.repository.ShareRepository;
import java.util.List;

public class SharePriceService {

    private final DataFetcherService dataFetcher; 
    private final ShareRepository repository; 

    public SharePriceService(DataFetcherService dataFetcher, ShareRepository repository) {
        this.dataFetcher = dataFetcher;
        this.repository = repository;
    }

    public List<Price> getSharePrices(String symbol, String startDate, String endDate) {
        System.out.println("[SharePriceService] Request for: " + symbol
                + " | " + startDate + " -> " + endDate);

        if (repository.hasData(symbol, startDate, endDate)) {
            System.out.println("[SharePriceService] Returning locally cached data.");
            return repository.getPrices(symbol, startDate, endDate);
        }

        if (dataFetcher.isAvailable()) {
            List<Price> prices = dataFetcher.fetchPrices(symbol, startDate, endDate);

            repository.savePrices(prices);
            return prices;
        }
      
        System.out.println("[SharePriceService] Network unavailable. Returning any cached data.");
        return repository.getPrices(symbol, startDate, endDate);
    }

   
    public List<Price>[] comparePrices(String symbolA, String symbolB,
                                       String startDate, String endDate) {
        @SuppressWarnings("unchecked")
        List<Price>[] results = new List[2];
        results[0] = getSharePrices(symbolA, startDate, endDate);
        results[1] = getSharePrices(symbolB, startDate, endDate);
        return results;
    }
}
