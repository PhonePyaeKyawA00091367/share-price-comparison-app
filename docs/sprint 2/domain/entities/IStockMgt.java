package domain.interfaces;

import domain.entities.DateRange;
import domain.entities.SharePrice;

import java.util.List;

public interface IStockMgt {
    List<SharePrice> searchStockPrices(String symbol, DateRange dateRange);
    List<SharePrice> loadStoredData(String key);
    void savePriceData(String key, List<SharePrice> prices);
}
