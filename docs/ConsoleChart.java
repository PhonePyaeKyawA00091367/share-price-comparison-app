package adapters;

import interfaces.IChart;
import entities.SharePrice;
import java.util.List;

public class ConsoleChart implements IChart {

    @Override
    public void display(List<SharePrice> data) {
        System.out.println("=== Chart ===");

        for (SharePrice sp : data) {
            System.out.println(sp.getDate() + " : " + sp.getPrice());
        }
    }
}
