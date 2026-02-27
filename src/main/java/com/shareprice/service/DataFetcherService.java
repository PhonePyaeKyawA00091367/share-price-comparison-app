package com.shareprice.service;

import com.shareprice.model.Price;
import java.util.List;

public interface DataFetcherService {

    List<Price> fetchPrices(String symbol, String startDate, String endDate);

    boolean isAvailable();
}
