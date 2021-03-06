package org.kenux.tdd.domain;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public Money times(int multiplier) {
        return new Franc(amount * multiplier, currency);
    }

    @Override
    public String currency() {
        return currency;
    }
}
