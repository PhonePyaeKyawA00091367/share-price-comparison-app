package application.pipeline;

import domain.model.SharePrice;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveInvalidPricesFilter implements PriceFilter {

    @Override
    public List<SharePrice> apply(List<SharePrice> prices) {
        return prices.stream()
                .filter(price -> price.getClosePrice() > 0)
                .collect(Collectors.toList());
    }
}
