package application.usecases;

import domain.entities.DateRange;
import domain.entities.Stock;
import domain.interfaces.IChartMgt;
import domain.interfaces.IPriceRepository;

public class CompareStocksUseCase {

    private final IPriceRepository repository;
    private final IChartMgt chartMgt;

    public CompareStocksUseCase(IPriceRepository repository, IChartMgt chartMgt) {
        this.repository = repository;
        this.chartMgt = chartMgt;
    }

    public void execute(Stock firstStock, Stock secondStock, DateRange dateRange) {
        firstStock.setPrices(repository.fetchPrices(firstStock.getSymbol(), dateRange));
        secondStock.setPrices(repository.fetchPrices(secondStock.getSymbol(), dateRange));
        chartMgt.compareStocks(firstStock, secondStock);
    }
}
