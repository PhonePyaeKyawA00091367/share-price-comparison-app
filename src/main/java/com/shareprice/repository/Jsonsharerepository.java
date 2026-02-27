package com.shareprice.repository;

import com.shareprice.model.Price;
import java.util.ArrayList;
import java.util.List;

public class JsonShareRepository implements ShareRepository {

    private final String storageDirectory;

  
    public JsonShareRepository(String storageDirectory) {
        this.storageDirectory = storageDirectory;
        System.out.println("[JsonShareRepository] Initialized with storage at: " + storageDirectory);
    }

  
    @Override
    public void savePrices(List<Price> prices) {
        if (prices == null || prices.isEmpty()) {
            System.out.println("[JsonShareRepository] No prices to save.");
            return;
        }
        String symbol = prices.get(0).getSymbol();
        
        System.out.println("[JsonShareRepository] Saving " + prices.size() + " entries for " + symbol);
    }

  
    @Override
    public List<Price> getPrices(String symbol, String startDate, String endDate) {
        System.out.println("[JsonShareRepository] Fetching prices for " + symbol
                + " from " + startDate + " to " + endDate);
        return new ArrayList<>(); 
    }

  
    @Override
    public boolean hasData(String symbol, String startDate, String endDate) {
        System.out.println("[JsonShareRepository] Checking local data for: " + symbol);
        return false; 
    }


    @Override
    public void deleteData(String symbol) {
        System.out.println("[JsonShareRepository] Deleting data for: " + symbol);
    }
}
