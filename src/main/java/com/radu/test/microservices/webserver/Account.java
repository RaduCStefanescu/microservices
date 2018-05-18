package com.radu.test.microservices.webserver;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.math.BigDecimal;

@JsonRootName("Account")
public class Account {

    protected Long id;
    protected String number;
    protected String owner;
    protected BigDecimal balance;

    protected Account() {
        balance = BigDecimal.ZERO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public BigDecimal getBalance() {
        return balance.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }

    public void setBalance(BigDecimal value) {
        balance = value;
        balance.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }

    @Override
    public String toString() {
        return number + " [" + owner + "]: $" + balance;
    }
}
