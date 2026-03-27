package infrastructure.persistence;

import domain.entities.Currency;
import domain.entities.DateRange;
import domain.entities.SharePrice;
import domain.interfaces.IMarketDataProvider;
import domain.interfaces.IPriceRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PriceRepository implements IPriceRepository {

    private final IMarketDataProvider marketDataProvider;

    public PriceRepository(IMarketDataProvider marketDataProvider) {
        this.marketDataProvider = marketDataProvider;
    }

    @Override
    public List<SharePrice> fetchPrices(String symbol, DateRange dateRange) {
        List<String> rawPrices = marketDataProvider.getRawPrices(symbol, dateRange);
        List<SharePrice> result = new ArrayList<>();

        for (String raw : rawPrices) {
            String[] parts = raw.split(",");
            LocalDate date = LocalDate.parse(parts[0]);
            double price = Double.parseDouble(parts[1]);
            Currency currency = Currency.valueOf(parts[2]);
            result.add(new SharePrice(date, price, currency));
        }

        return result;
    }
}
