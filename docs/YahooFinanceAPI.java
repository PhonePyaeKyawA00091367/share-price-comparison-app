package external;

import interfaces.IYahooAPI;
import java.util.*;

public class YahooFinanceAPI implements IYahooAPI {

    @Override
    public List<String> fetch(String symbol, String start, String end) {
        System.out.println("Fetching from API...");

        return Arrays.asList(
                "2024-01-01:100",
                "2024-01-02:105",
                "2024-01-03:110"
        );
    }
}
