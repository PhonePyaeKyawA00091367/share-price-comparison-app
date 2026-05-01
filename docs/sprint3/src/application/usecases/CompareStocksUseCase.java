package application.usecases;

import application.pipeline.PriceDataPipeline;
import application.services.ShareRepository;
import domain.model.DateRange;
import domain.model.Stock;

public class CompareStocksUseCase {
    private final ShareRepository repository;
    private final PriceDataPipeline pipeline;

    public CompareStocksUseCase(ShareRepository repository, PriceDataPipeline pipeline) {
        this.repository = repository;
        this.pipeline = pipeline;
    }

    public void execute(Stock first, Stock second, DateRange range) {
        first.setPrices(pipeline.process(repository.getPrices(first.getSymbol(), range)));
        second.setPrices(pipeline.process(repository.getPrices(second.getSymbol(), range)));
    }
}
