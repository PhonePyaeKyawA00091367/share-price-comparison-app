package adapters;

import interfaces.*;
import entities.SharePrice;
import java.util.*;

public class ShareRepository implements IShareRepository {

    private IYahooAPI api;

    public ShareRepository(IYahooAPI api) {
        this.api = api;
    }

    @Override
    public List<SharePrice> getPrices(String symbol, String start, String end) {

        List<String> raw = api.fetch(symbol, start, end);
        List<SharePrice> list = new ArrayList<>();

        for (String r : raw) {
            String[] parts = r.split(":");
            list.add(new SharePrice(parts[0], Double.parseDouble(parts[1])));
        }

        return list;
    }
}
