package application.services;

import domain.model.DateRange;
import domain.model.SharePrice;

import java.util.List;

public interface StockService {
    List<SharePrice> searchStockPrices(String symbol, DateRange range);
}
