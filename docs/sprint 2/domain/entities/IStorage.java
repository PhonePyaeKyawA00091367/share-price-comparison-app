package domain.interfaces;

import domain.entities.SharePrice;

import java.util.List;

public interface IStorage {
    void save(String key, List<SharePrice> prices);
    List<SharePrice> load(String key);
}
