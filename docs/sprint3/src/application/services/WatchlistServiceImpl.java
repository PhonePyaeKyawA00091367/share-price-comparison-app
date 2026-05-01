package application.services;

import domain.model.Stock;

import java.util.ArrayList;
import java.util.List;

public class WatchlistServiceImpl implements WatchlistService {
    private final List<Stock> watchlist = new ArrayList<>();

    @Override
    public void addStock(Stock stock) {
        watchlist.add(stock);
    }

    @Override
    public void removeStock(String symbol) {
        watchlist.removeIf(stock -> stock.getSymbol().equalsIgnoreCase(symbol));
    }

    @Override
    public List<Stock> viewWatchlist() {
        return watchlist;
    }
}
