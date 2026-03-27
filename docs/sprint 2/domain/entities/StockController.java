package presentation.controller;

import application.usecases.CompareStocksUseCase;
import application.usecases.LoadStoredDataUseCase;
import application.usecases.SavePriceDataUseCase;
import application.usecases.SearchStockPricesUseCase;
import domain.entities.DateRange;
import domain.entities.SharePrice;
import domain.entities.Stock;
import domain.interfaces.IChartMgt;

import java.util.List;

public class StockController {

    private final SearchStockPricesUseCase searchUseCase;
    private final CompareStocksUseCase compareUseCase;
    private final SavePriceDataUseCase saveUseCase;
    private final LoadStoredDataUseCase loadUseCase;
    private final IChartMgt chartMgt;

    public StockController(SearchStockPricesUseCase searchUseCase,
                           CompareStocksUseCase compareUseCase,
                           SavePriceDataUseCase saveUseCase,
                           LoadStoredDataUseCase loadUseCase,
                           IChartMgt chartMgt) {
        this.searchUseCase = searchUseCase;
        this.compareUseCase = compareUseCase;
        this.saveUseCase = saveUseCase;
        this.loadUseCase = loadUseCase;
        this.chartMgt = chartMgt;
    }

    public Stock searchAndDisplay(String symbol, String companyName, DateRange dateRange) {
        List<SharePrice> prices = searchUseCase.searchStockPrices(symbol, dateRange);
        Stock stock = new Stock(symbol, companyName);
        stock.setPrices(prices);
        chartMgt.viewHistoricalChart(stock);
        return stock;
    }

    public void compare(Stock first, Stock second, DateRange dateRange) {
        compareUseCase.execute(first, second, dateRange);
    }

    public void savePrices(String key, List<SharePrice> prices) {
        saveUseCase.execute(key, prices);
    }

    public List<SharePrice> loadPrices(String key) {
        return loadUseCase.execute(key);
    }
}
