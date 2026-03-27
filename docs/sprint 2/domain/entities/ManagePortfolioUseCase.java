package application.usecases;

import domain.entities.Stock;
import domain.entities.User;
import domain.interfaces.IUserMgt;

import java.util.List;

public class ManagePortfolioUseCase implements IUserMgt {

    @Override
    public void addToPortfolio(User user, Stock stock) {
        user.getPortfolio().addStock(stock);
    }

    @Override
    public void addToWatchlist(User user, Stock stock) {
        user.getWatchlist().addStock(stock);
    }

    @Override
    public List<Stock> viewPortfolio(User user) {
        return user.getPortfolio().getStocks();
    }

    @Override
    public List<Stock> viewWatchlist(User user) {
        return user.getWatchlist().getStocks();
    }
}
