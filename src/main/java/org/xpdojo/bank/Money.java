package org.xpdojo.bank;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public class Money {

    public Integer getAmount() {
        return amount;
    }

    private final int amount;

    public Money(int i) {
        amount = i;
    }
}
