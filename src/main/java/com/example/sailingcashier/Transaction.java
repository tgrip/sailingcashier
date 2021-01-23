package com.example.sailingcashier;

import java.time.LocalDateTime;

public class Transaction {

    private Trip trip;
    private Crew member;
    private Money money;
    private TransactionType type;
    private LocalDateTime created;

    public Transaction(Trip trip, Crew member, Money money, TransactionType type) {
        this.trip = trip;
        this.member = member;
        this.money = money;
        this.type = type;
        created = LocalDateTime.now();
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Crew getMember() {
        return member;
    }

    public void setMember(Crew member) {
        this.member = member;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

}
