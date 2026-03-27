package infrastructure.chart;

import domain.entities.ComparisonChart;
import domain.entities.HistoricalChart;
import domain.entities.Stock;
import domain.interfaces.IChartMgt;

import java.util.List;

public class ConsoleChartRenderer implements IChartMgt {

    @Override
    public void viewHistoricalChart(Stock stock) {
        HistoricalChart chart = new HistoricalChart("Historical Chart: " + stock.getSymbol());
        chart.render(List.of(stock));
    }

    @Override
    public void compareStocks(Stock firstStock, Stock secondStock) {
        ComparisonChart chart = new ComparisonChart(
                "Comparison Chart: " + firstStock.getSymbol() + " vs " + secondStock.getSymbol()
        );
        chart.render(List.of(firstStock, secondStock));
    }
}
