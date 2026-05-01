package test;

import application.pipeline.PriceDataPipeline;
import application.pipeline.RemoveInvalidPricesFilter;
import application.pipeline.SortByDateFilter;
import domain.model.SharePrice;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Sprint3Test {

    public static void main(String[] args) {
        testPipelineSortsAndRemovesInvalidPrices();
        System.out.println("All Sprint 3 tests passed.");
    }

    private static void testPipelineSortsAndRemovesInvalidPrices() {
        List<SharePrice> prices = Arrays.asList(
                new SharePrice(LocalDate.of(2024, 1, 3), 110),
                new SharePrice(LocalDate.of(2024, 1, 1), 100),
                new SharePrice(LocalDate.of(2024, 1, 2), -1)
        );

        PriceDataPipeline pipeline = new PriceDataPipeline();
        pipeline.addFilter(new RemoveInvalidPricesFilter());
        pipeline.addFilter(new SortByDateFilter());

        List<SharePrice> result = pipeline.process(prices);

        if (result.size() != 2) {
            throw new AssertionError("Invalid price was not removed.");
        }

        if (!result.get(0).getDate().equals(LocalDate.of(2024, 1, 1))) {
            throw new AssertionError("Prices were not sorted by date.");
        }
    }
}
