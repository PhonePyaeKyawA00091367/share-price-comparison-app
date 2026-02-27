package com.shareprice.ui;

import com.shareprice.model.Price;
import java.util.List;


public class BasicChartComponent implements ChartComponent {

    @Override
    public void renderSingleChart(List<Price> prices, String title) {
        System.out.println("\n=== Chart: " + title + " ===");
        if (prices == null || prices.isEmpty()) {
            System.out.println("No data to display.");
            return;
        }
        for (Price p : prices) {
          
            System.out.println(p.getDate() + " | " + p.getSymbol() + " | $" + p.getValue());
        }
        System.out.println("=========================\n");
    }

    
    @Override
    public void renderComparisonChart(List<Price> pricesA, List<Price> pricesB, String title) {
        System.out.println("\n=== Comparison Chart: " + title + " ===");

        System.out.println("-- Series A: " + (pricesA.isEmpty() ? "N/A" : pricesA.get(0).getSymbol()) + " --");
        for (Price p : pricesA) {
            System.out.println(p.getDate() + " | $" + p.getValue());
        }

        System.out.println("-- Series B: " + (pricesB.isEmpty() ? "N/A" : pricesB.get(0).getSymbol()) + " --");
        for (Price p : pricesB) {
            System.out.println(p.getDate() + " | $" + p.getValue());
        }
        System.out.println("=====================================\n");
    }

  
    @Override
    public void clearChart() {

        System.out.println("[BasicChartComponent] Chart cleared.");
    }
}
