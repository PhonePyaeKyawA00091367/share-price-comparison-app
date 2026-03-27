package application.usecases;

import domain.entities.Stock;
import domain.entities.User;

import java.util.List;

public class ManageWatchlistUseCase {

    public void add(User user, Stock stock) {
        user.getWatchlist().addStock(stock);
    }

    public void remove(User user, String symbol) {
        user.getWatchlist().removeStock(symbol);
    }

    public List<Stock> view(User user) {
        return user.getWatchlist().getStocks();
    }
}
