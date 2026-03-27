package domain.interfaces;

import domain.entities.DateRange;
import domain.entities.SharePrice;

import java.util.List;

public interface IPriceRepository {
    List<SharePrice> fetchPrices(String symbol, DateRange dateRange);
}
