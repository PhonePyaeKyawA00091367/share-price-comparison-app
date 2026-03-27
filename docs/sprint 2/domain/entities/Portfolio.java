package domain.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Portfolio {
    private final List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        if (stock != null && stocks.stream().noneMatch(s -> s.getSymbol().equals(stock.getSymbol()))) {
            stocks.add(stock);
        }
    }

    public void removeStock(String symbol) {
        stocks.removeIf(stock -> stock.getSymbol().equalsIgnoreCase(symbol));
    }

    public List<Stock> getStocks() {
        return Collections.unmodifiableList(stocks);
    }
}
