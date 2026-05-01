package application.usecases;

import application.pipeline.PriceDataPipeline;
import application.services.ShareRepository;
import domain.model.DateRange;
import domain.model.SharePrice;

import java.util.List;

public class SearchStockPricesUseCase {
    private final ShareRepository repository;
    private final PriceDataPipeline pipeline;

    public SearchStockPricesUseCase(ShareRepository repository, PriceDataPipeline pipeline) {
        this.repository = repository;
        this.pipeline = pipeline;
    }

    public List<SharePrice> execute(String symbol, DateRange range) {
        List<SharePrice> prices = repository.getPrices(symbol, range);
        return pipeline.process(prices);
    }
}
