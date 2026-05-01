package application.usecases;

import application.services.LocalStorage;
import domain.model.SharePrice;

import java.util.List;

public class LoadStoredDataUseCase {
    private final LocalStorage storage;

    public LoadStoredDataUseCase(LocalStorage storage) {
        this.storage = storage;
    }

    public List<SharePrice> execute(String symbol) {
        return storage.load(symbol);
    }
}
