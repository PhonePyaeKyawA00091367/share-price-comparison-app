package domain.interfaces;

import domain.entities.Stock;
import domain.entities.User;

import java.util.List;

public interface IUserMgt {
    void addToPortfolio(User user, Stock stock);
    void addToWatchlist(User user, Stock stock);
    List<Stock> viewPortfolio(User user);
    List<Stock> viewWatchlist(User user);
}
