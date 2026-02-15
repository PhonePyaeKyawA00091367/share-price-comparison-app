package com.shareprice.repository;

import com.shareprice.model.Price;
import java.util.List;

public interface PriceRepository {

    void save(Price price);

    List<Price> findAll();

    Price findBySymbol(String symbol);
}
