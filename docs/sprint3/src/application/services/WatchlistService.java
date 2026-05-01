package application.services;

import domain.model.Stock;

import java.util.List;

public interface WatchlistService {
    void addStock(Stock stock);
    void removeStock(String symbol);
    List<Stock> viewWatchlist();
}
