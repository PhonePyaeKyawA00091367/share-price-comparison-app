package application.usecases;

import domain.entities.DateRange;
import domain.entities.SharePrice;
import domain.interfaces.IPriceRepository;
import domain.interfaces.IStockMgt;

import java.util.List;

public class SearchStockPricesUseCase implements IStockMgt {

    private final IPriceRepository repository;
    private final domain.interfaces.IStorage storage;

    public SearchStockPricesUseCase(IPriceRepository repository, domain.interfaces.IStorage storage) {
        this.repository = repository;
        this.storage = storage;
    }

    @Override
    public List<SharePrice> searchStockPrices(String symbol, DateRange dateRange) {
        return repository.fetchPrices(symbol, dateRange);
    }

    @Override
    public List<SharePrice> loadStoredData(String key) {
        return storage.load(key);
    }

    @Override
    public void savePriceData(String key, List<SharePrice> prices) {
        storage.save(key, prices);
    }
}
