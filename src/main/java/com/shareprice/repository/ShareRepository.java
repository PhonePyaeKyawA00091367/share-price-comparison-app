package com.shareprice.repository;

import com.shareprice.model.Price;
import java.util.List;


public interface ShareRepository {


    void savePrices(List<Price> prices);

   
    List<Price> getPrices(String symbol, String startDate, String endDate);

    boolean hasData(String symbol, String startDate, String endDate);

  
    void deleteData(String symbol);
}
