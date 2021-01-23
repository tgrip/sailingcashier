package com.example.sailingcashier;

import java.util.Currency;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cashier {

    private Trip trip;
    private Map<Currency, Money> currencies;

    public Cashier(Trip trip) {
        this.trip = trip;
        currencies = new ConcurrentHashMap<>();
    }

    public void saveMoney(Money money) {
        Currency currency = money.getCurrency();
        Money existing = currencies.getOrDefault(currency, new Money(currency));
        Money result = existing.save(money);
        currencies.put(currency, result);
    }
}
