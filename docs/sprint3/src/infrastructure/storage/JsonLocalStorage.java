package infrastructure.storage;

import application.services.LocalStorage;
import domain.model.SharePrice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class JsonLocalStorage implements LocalStorage {
    private final Map<String, List<SharePrice>> database = new HashMap<>();

    @Override
    public void save(String symbol, List<SharePrice> prices) {
        database.put(symbol.toUpperCase(), new ArrayList<>(prices));
        System.out.println("Saved " + prices.size() + " prices for " + symbol);
    }

    @Override
    public List<SharePrice> load(String symbol) {
        return database.getOrDefault(symbol.toUpperCase(), new ArrayList<>());
    }
}
