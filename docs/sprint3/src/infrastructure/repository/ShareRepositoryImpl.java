package infrastructure.repository;

import application.services.ShareRepository;
import application.services.YahooFinanceClient;
import domain.model.DateRange;
import domain.model.SharePrice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ShareRepositoryImpl implements ShareRepository {
    private final YahooFinanceClient yahooFinanceClient;

    public ShareRepositoryImpl(YahooFinanceClient yahooFinanceClient) {
        this.yahooFinanceClient = yahooFinanceClient;
    }

    @Override
    public List<SharePrice> getPrices(String symbol, DateRange range) {
        List<String> rawPrices = yahooFinanceClient.fetchRawPrices(symbol, range);
        List<SharePrice> prices = new ArrayList<>();

        for (String raw : rawPrices) {
            String[] parts = raw.split(",");
            prices.add(new SharePrice(
                    LocalDate.parse(parts[0]),
                    Double.parseDouble(parts[1])
            ));
        }

        return prices;
    }
}
