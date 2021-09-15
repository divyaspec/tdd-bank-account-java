package org.xpdojo.bank;

public class Account {

    public Account(Integer balance) {
        this.balance = balance;
    }

    public Integer balance;

    public void deposit(Integer i) {
        balance = balance + i;
    }

    public Integer balance() {
        return balance;
    }

    public void withdraw(Integer i) {
        if (balance < i) {
            throw new IllegalArgumentException("balance is low");
        }
        balance = balance - i;
    }
}
