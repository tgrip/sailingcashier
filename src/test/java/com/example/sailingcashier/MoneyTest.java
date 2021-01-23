package com.example.sailingcashier;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Currency;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    void addMoney() {
        Currency eur = Currency.getInstance("EUR");
        Money money = new Money(eur);

        BigDecimal five = BigDecimal.valueOf(5);
        Money other = new Money(five, eur);
        Money result = money.add(other);

        assertEquals(five, result.getValue());
        assertEquals(eur, result.getCurrency());
    }

    @Test
    void subtractMoney() {
        Currency eur = Currency.getInstance("EUR");
        BigDecimal five = BigDecimal.valueOf(5);
        Money money = new Money(five, eur);
        Money other = new Money(new BigDecimal(".5"), eur);

        Money result = money.substract(other);

        assertEquals(new BigDecimal("4.5"), result.getValue());
    }
}