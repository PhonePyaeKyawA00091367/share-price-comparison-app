package infrastructure.persistence;

import domain.entities.SharePrice;
import domain.interfaces.IStorage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryStorage implements IStorage {

    private final Map<String, List<SharePrice>> storage = new HashMap<>();

    @Override
    public void save(String key, List<SharePrice> prices) {
        storage.put(key, new ArrayList<>(prices));
    }

    @Override
    public List<SharePrice> load(String key) {
        return storage.getOrDefault(key, new ArrayList<>());
    }
}
