package application.services;

import domain.model.Stock;

import java.util.List;

public interface PortfolioService {
    void addStock(Stock stock);
    List<Stock> viewPortfolio();
}
