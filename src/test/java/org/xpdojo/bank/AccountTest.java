package org.xpdojo.bank;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(100);

        assertThat(account.balance()).isEqualTo(100);
    }
}
