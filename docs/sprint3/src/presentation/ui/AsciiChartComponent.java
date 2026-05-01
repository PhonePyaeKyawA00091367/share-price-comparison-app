package presentation.ui;

import domain.model.SharePrice;
import domain.model.Stock;

public class AsciiChartComponent implements ChartComponent {

    @Override
    public void render(Stock stock) {
        System.out.println("\nASCII Chart for " + stock.getSymbol());

        for (SharePrice price : stock.getPrices()) {
            int bars = (int) price.getClosePrice() / 10;
            System.out.println(price.getDate() + " " + "*".repeat(bars));
        }
    }
}
