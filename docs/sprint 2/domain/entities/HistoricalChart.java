package domain.entities;

import java.util.List;

public class HistoricalChart extends Chart {

    public HistoricalChart(String title) {
        super(title);
    }

    @Override
    public void render(List<Stock> stocks) {
        System.out.println("=== " + getTitle() + " ===");
        for (Stock stock : stocks) {
            System.out.println("Stock: " + stock.getSymbol());
            for (SharePrice price : stock.getSharePrices()) {
                System.out.println(price);
            }
        }
    }
}
