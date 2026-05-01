package application.services;

import application.usecases.SearchStockPricesUseCase;
import domain.model.DateRange;
import domain.model.SharePrice;

import java.util.List;

public class StockServiceImpl implements StockService {
    private final SearchStockPricesUseCase searchUseCase;

    public StockServiceImpl(SearchStockPricesUseCase searchUseCase) {
        this.searchUseCase = searchUseCase;
    }

    @Override
    public List<SharePrice> searchStockPrices(String symbol, DateRange range) {
        return searchUseCase.execute(symbol, range);
    }
}
