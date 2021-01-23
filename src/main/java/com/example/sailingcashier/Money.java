package com.example.sailingcashier;

import java.math.BigDecimal;
import java.util.Currency;

public class Money {

    private Currency currency;
    private BigDecimal value;


    public Money(Currency currency) {
        this.currency = currency;
        value = BigDecimal.valueOf(0);
    }

    public Money(BigDecimal value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Money add(Money other) {
        if (this.currency.equals(other.currency)) {
            return new Money(value.add(other.value), currency);
        } else {
            throw new IllegalArgumentException("Only money of the same currency can be added");
        }
    }

    public Money substract(Money other) {
        if (this.currency.equals(other.currency)) {
            if (value.doubleValue() >= other.value.doubleValue()) {
                return new Money(value.subtract(other.value), currency);
            } else {
                throw new IllegalArgumentException("Not enough money available");
            }
        } else {
            throw new IllegalArgumentException("Only money of the same currency can be added");
        }

    }
}
