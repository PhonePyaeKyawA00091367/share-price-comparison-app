package presentation.ui;

import domain.model.SharePrice;
import domain.model.Stock;

public class PriceTableComponent implements ChartComponent {

    @Override
    public void render(Stock stock) {
        System.out.println("\nPrice Table for " + stock.getSymbol());

        for (SharePrice price : stock.getPrices()) {
            System.out.println(price.getDate() + " | " + price.getClosePrice());
        }
    }
}
