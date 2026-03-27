package application.usecases;

import domain.entities.SharePrice;
import domain.interfaces.IStorage;

import java.util.List;

public class SavePriceDataUseCase {

    private final IStorage storage;

    public SavePriceDataUseCase(IStorage storage) {
        this.storage = storage;
    }

    public void execute(String key, List<SharePrice> prices) {
        storage.save(key, prices);
    }
}
