package domain.entities;

import java.util.List;

public class ComparisonChart extends Chart {

    public ComparisonChart(String title) {
        super(title);
    }

    @Override
    public void render(List<Stock> stocks) {
        System.out.println("=== " + getTitle() + " ===");
        System.out.println("Comparing stocks:");
        for (Stock stock : stocks) {
            System.out.println("- " + stock.getSymbol());
            for (SharePrice price : stock.getSharePrices()) {
                System.out.println("  " + price);
            }
        }
    }
}
