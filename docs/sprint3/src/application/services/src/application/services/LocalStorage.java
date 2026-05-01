package application.services;

import domain.model.SharePrice;

import java.util.List;

public interface LocalStorage {
    void save(String symbol, List<SharePrice> prices);
    List<SharePrice> load(String symbol);
}
