package adapters;

import usecases.*;
import entities.SharePrice;
import java.util.List;

public class ShareController {

    private SearchSharePrices search;
    private SaveData save;
    private LoadData load;
    private ViewChart view;

    public ShareController(SearchSharePrices search,
                           SaveData save,
                           LoadData load,
                           ViewChart view) {
        this.search = search;
        this.save = save;
        this.load = load;
        this.view = view;
    }

    public void handle(String symbol, String start, String end) {

        List<SharePrice> data = search.execute(symbol, start, end);

        save.execute(data);

        view.execute(data);
    }
}
