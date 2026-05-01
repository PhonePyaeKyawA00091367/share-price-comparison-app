package application.usecases;

import application.services.LocalStorage;
import domain.model.SharePrice;

import java.util.List;

public class SavePriceDataUseCase {
    private final LocalStorage storage;

    public SavePriceDataUseCase(LocalStorage storage) {
        this.storage = storage;
    }

    public void execute(String symbol, List<SharePrice> prices) {
        storage.save(symbol, prices);
    }
}
