package com.shareprice.ui;

import com.shareprice.model.Price;
import java.util.List;

public interface ChartComponent {

    void renderSingleChart(List<Price> prices, String title);

    void renderComparisonChart(List<Price> pricesA, List<Price> pricesB, String title);

    void clearChart();
}
