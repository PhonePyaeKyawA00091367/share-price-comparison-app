package application.services;

import domain.model.DateRange;
import domain.model.SharePrice;

import java.util.List;

public interface ShareRepository {
    List<SharePrice> getPrices(String symbol, DateRange range);
}
