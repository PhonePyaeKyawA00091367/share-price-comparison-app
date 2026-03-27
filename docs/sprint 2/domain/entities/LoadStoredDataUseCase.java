package application.usecases;

import domain.entities.SharePrice;
import domain.interfaces.IStorage;

import java.util.List;

public class LoadStoredDataUseCase {

    private final IStorage storage;

    public LoadStoredDataUseCase(IStorage storage) {
        this.storage = storage;
    }

    public List<SharePrice> execute(String key) {
        return storage.load(key);
    }
}
