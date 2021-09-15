package org.xpdojo.bank;

public class Account {

    public Integer balance;

    public void deposit(Integer i) {
        this.balance = balance + i;
    }

    public Integer balance() {
        return balance;
    }
}
