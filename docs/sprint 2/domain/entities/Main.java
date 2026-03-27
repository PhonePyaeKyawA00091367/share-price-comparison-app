package main;

import application.usecases.CompareStocksUseCase;
import application.usecases.LoadStoredDataUseCase;
import application.usecases.SavePriceDataUseCase;
import application.usecases.SearchStockPricesUseCase;
import domain.entities.DateRange;
import domain.entities.Stock;
import infrastructure.api.YahooFinanceApi;
import infrastructure.chart.ConsoleChartRenderer;
import infrastructure.persistence.InMemoryStorage;
import infrastructure.persistence.PriceRepository;
import presentation.controller.StockController;
import presentation.ui.ConsoleUI;

public class Main {

    public static void main(String[] args) {
        YahooFinanceApi api = new YahooFinanceApi();
        PriceRepository repository = new PriceRepository(api);
        InMemoryStorage storage = new InMemoryStorage();
        ConsoleChartRenderer chartRenderer = new ConsoleChartRenderer();

        SearchStockPricesUseCase searchUseCase = new SearchStockPricesUseCase(repository, storage);
        CompareStocksUseCase compareUseCase = new CompareStocksUseCase(repository, chartRenderer);
        SavePriceDataUseCase saveUseCase = new SavePriceDataUseCase(storage);
        LoadStoredDataUseCase loadUseCase = new LoadStoredDataUseCase(storage);

        StockController controller = new StockController(
                searchUseCase,
                compareUseCase,
                saveUseCase,
                loadUseCase,
                chartRenderer
        );

        ConsoleUI ui = new ConsoleUI();

        String symbol = ui.getSymbol();
        String companyName = ui.getCompanyName();
        DateRange range = ui.getDateRange();

        Stock firstStock = controller.searchAndDisplay(symbol, companyName, range);
        controller.savePrices(firstStock.getSymbol(), firstStock.getSharePrices());

        Stock secondStock = new Stock("MSFT", "Microsoft");
        controller.compare(firstStock, secondStock, range);
    }
}
