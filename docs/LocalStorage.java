package adapters;

import interfaces.IStorage;
import entities.SharePrice;
import java.util.*;

public class LocalStorage implements IStorage {

    private List<SharePrice> db = new ArrayList<>();

    @Override
    public void save(List<SharePrice> data) {
        System.out.println("Saving...");
        db.addAll(data);
    }

    @Override
    public List<SharePrice> load() {
        return db;
    }
}
