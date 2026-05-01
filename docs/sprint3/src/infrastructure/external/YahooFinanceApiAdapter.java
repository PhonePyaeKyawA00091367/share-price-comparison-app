package infrastructure.external;

import application.services.YahooFinanceClient;
import domain.model.DateRange;

import java.util.Arrays;
import java.util.List;

public class YahooFinanceApiAdapter implements YahooFinanceClient {

    @Override
    public List<String> fetchRawPrices(String symbol, DateRange range) {
        return Arrays.asList(
                "2024-01-03,110.00",
                "2024-01-01,100.00",
                "2024-01-02,105.00"
        );
    }
}
