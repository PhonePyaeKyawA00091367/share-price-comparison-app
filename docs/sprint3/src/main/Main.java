package main;

import application.pipeline.PriceDataPipeline;
import application.pipeline.RemoveInvalidPricesFilter;
import application.pipeline.SortByDateFilter;
import application.services.*;
import application.usecases.*;
import domain.model.DateRange;
import infrastructure.external.YahooFinanceApiAdapter;
import infrastructure.repository.ShareRepositoryImpl;
import infrastructure.storage.JsonLocalStorage;
import presentation.controller.UserInterface;
import presentation.ui.AsciiChartComponent;
import presentation.ui.CompoundChartComponent;
import presentation.ui.PriceTableComponent;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        YahooFinanceClient yahooClient = new YahooFinanceApiAdapter();

        ShareRepository repository = new ShareRepositoryImpl(yahooClient);
        LocalStorage storage = new JsonLocalStorage();

        PriceDataPipeline pipeline = new PriceDataPipeline();
        pipeline.addFilter(new RemoveInvalidPricesFilter());
        pipeline.addFilter(new SortByDateFilter());

        SearchStockPricesUseCase searchUseCase =
                new SearchStockPricesUseCase(repository, pipeline);

        CompareStocksUseCase compareUseCase =
                new CompareStocksUseCase(repository, pipeline);

        SavePriceDataUseCase saveUseCase =
                new SavePriceDataUseCase(storage);

        LoadStoredDataUseCase loadUseCase =
                new LoadStoredDataUseCase(storage);

        StockService stockService =
                new StockServiceImpl(searchUseCase);

        PortfolioService portfolioService =
                new PortfolioServiceImpl();

        WatchlistService watchlistService =
                new WatchlistServiceImpl();

        CompoundChartComponent compoundChart = new CompoundChartComponent();
        compoundChart.addComponent(new PriceTableComponent());
        compoundChart.addComponent(new AsciiChartComponent());

        UserInterface ui = new UserInterface(
                stockService,
                portfolioService,
                watchlistService,
                compareUseCase,
                saveUseCase,
                loadUseCase,
                compoundChart
        );

        DateRange range = new DateRange(
                LocalDate.of(2024, 1, 1),
                LocalDate.of(2024, 1, 3)
        );

        ui.searchAndDisplayStock("AAPL", "Apple", range);
        ui.compareStocks("AAPL", "MSFT", range);
        ui.addToPortfolio("AAPL", "Apple");
        ui.addToWatchlist("MSFT", "Microsoft");
        ui.viewStoredData("AAPL");
    }
}
