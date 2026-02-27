package com.shareprice;

import com.shareprice.repository.JsonShareRepository;
import com.shareprice.repository.ShareRepository;
import com.shareprice.service.DataFetcherService;
import com.shareprice.service.SharePriceService;
import com.shareprice.service.YahooFinanceDataFetcher;
import com.shareprice.ui.BasicChartComponent;
import com.shareprice.ui.ChartComponent;
import com.shareprice.model.Price;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        System.out.println("=== Share Price Comparison App - Sprint 1 ===\n");

  
        ShareRepository repository = new JsonShareRepository("data/");
        DataFetcherService fetcher = new YahooFinanceDataFetcher();
        SharePriceService service = new SharePriceService(fetcher, repository);
        ChartComponent chart = new BasicChartComponent();

        
        String symbol = "AAPL";
        String startDate = "2024-01-01";
        String endDate = "2024-12-31";

        List<Price> prices = service.getSharePrices(symbol, startDate, endDate);
        chart.renderSingleChart(prices, symbol + " Share Price 2024");

       
        String symbolB = "GOOGL";
        List<Price>[] comparison = service.comparePrices(symbol, symbolB, startDate, endDate);
        chart.renderComparisonChart(comparison[0], comparison[1],
                symbol + " vs " + symbolB + " 2024");

        System.out.println("Sprint 1 component wiring complete.");
    }
}
