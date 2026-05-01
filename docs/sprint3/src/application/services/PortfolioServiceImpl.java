package application.services;

import domain.model.Stock;

import java.util.ArrayList;
import java.util.List;

public class PortfolioServiceImpl implements PortfolioService {
    private final List<Stock> portfolio = new ArrayList<>();

    @Override
    public void addStock(Stock stock) {
        portfolio.add(stock);
    }

    @Override
    public List<Stock> viewPortfolio() {
        return portfolio;
    }
}
