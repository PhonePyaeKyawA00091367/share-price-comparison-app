package domain.interfaces;

import domain.entities.Stock;

public interface IChartMgt {
    void viewHistoricalChart(Stock stock);
    void compareStocks(Stock firstStock, Stock secondStock);
}
