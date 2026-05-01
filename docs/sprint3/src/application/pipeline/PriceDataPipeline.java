package application.pipeline;

import domain.model.SharePrice;

import java.util.ArrayList;
import java.util.List;

public class PriceDataPipeline {
    private final List<PriceFilter> filters = new ArrayList<>();

    public void addFilter(PriceFilter filter) {
        filters.add(filter);
    }

    public List<SharePrice> process(List<SharePrice> prices) {
        List<SharePrice> result = prices;

        for (PriceFilter filter : filters) {
            result = filter.apply(result);
        }

        return result;
    }
}
