package application.pipeline;

import domain.model.SharePrice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByDateFilter implements PriceFilter {

    @Override
    public List<SharePrice> apply(List<SharePrice> prices) {
        return prices.stream()
                .sorted(Comparator.comparing(SharePrice::getDate))
                .collect(Collectors.toList());
    }
}
