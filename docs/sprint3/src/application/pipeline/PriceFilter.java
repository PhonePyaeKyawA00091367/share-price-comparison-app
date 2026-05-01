package application.pipeline;

import domain.model.SharePrice;

import java.util.List;

public interface PriceFilter {
    List<SharePrice> apply(List<SharePrice> prices);
}
