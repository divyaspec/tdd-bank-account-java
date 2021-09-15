package org.xpdojo.bank;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account(100);
        assertThat(account.balance()).isEqualTo(100);
    }

    @Test
    public void depositManyToIncreaseTheBalance() {
        Account account = new Account(100);
        account.deposit(300);

        assertThat(account.balance()).isEqualTo(400);
    }
}
