package presentation.controller;

import application.services.PortfolioService;
import application.services.StockService;
import application.services.WatchlistService;
import application.usecases.CompareStocksUseCase;
import application.usecases.LoadStoredDataUseCase;
import application.usecases.SavePriceDataUseCase;
import domain.model.DateRange;
import domain.model.SharePrice;
import domain.model.Stock;
import presentation.ui.CompoundChartComponent;

import java.util.List;

public class UserInterface {
    private final StockService stockService;
    private final PortfolioService portfolioService;
    private final WatchlistService watchlistService;
    private final CompareStocksUseCase compareStocksUseCase;
    private final SavePriceDataUseCase savePriceDataUseCase;
    private final LoadStoredDataUseCase loadStoredDataUseCase;
    private final CompoundChartComponent compoundChart;

    public UserInterface(
            StockService stockService,
            PortfolioService portfolioService,
            WatchlistService watchlistService,
            CompareStocksUseCase compareStocksUseCase,
            SavePriceDataUseCase savePriceDataUseCase,
            LoadStoredDataUseCase loadStoredDataUseCase,
            CompoundChartComponent compoundChart
    ) {
        this.stockService = stockService;
        this.portfolioService = portfolioService;
        this.watchlistService = watchlistService;
        this.compareStocksUseCase = compareStocksUseCase;
        this.savePriceDataUseCase = savePriceDataUseCase;
        this.loadStoredDataUseCase = loadStoredDataUseCase;
        this.compoundChart = compoundChart;
    }

    public void searchAndDisplayStock(String symbol, String companyName, DateRange range) {
        List<SharePrice> prices = stockService.searchStockPrices(symbol, range);

        Stock stock = new Stock(symbol, companyName);
        stock.setPrices(prices);

        compoundChart.render(stock);
        savePriceDataUseCase.execute(symbol, prices);
    }

    public void compareStocks(String firstSymbol, String secondSymbol, DateRange range) {
        Stock first = new Stock(firstSymbol, firstSymbol);
        Stock second = new Stock(secondSymbol, secondSymbol);

        compareStocksUseCase.execute(first, second, range);

        compoundChart.render(first);
        compoundChart.render(second);
    }

    public void addToPortfolio(String symbol, String companyName) {
        portfolioService.addStock(new Stock(symbol, companyName));
        System.out.println(symbol + " added to portfolio.");
    }

    public void addToWatchlist(String symbol, String companyName) {
        watchlistService.addStock(new Stock(symbol, companyName));
        System.out.println(symbol + " added to watchlist.");
    }

    public void viewStoredData(String symbol) {
        List<SharePrice> prices = loadStoredDataUseCase.execute(symbol);

        Stock stock = new Stock(symbol, symbol);
        stock.setPrices(prices);

        compoundChart.render(stock);
    }
}
