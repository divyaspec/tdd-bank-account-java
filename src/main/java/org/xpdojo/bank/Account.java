package org.xpdojo.bank;

public class Account {

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

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
}
