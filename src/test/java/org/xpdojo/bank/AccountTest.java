package org.xpdojo.bank;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void shouldWithdrawMoneyFromAccount() {
        Account account = new Account(500);

        account.withdraw(300);
        assertThat(account.balance).isEqualTo(200);
    }

    @Test
    public void shouldNotWithdrawMoreThanYourBalanceAvailable() {
        Account account = new Account(100);

        IllegalArgumentException error = assertThrows(IllegalArgumentException.class, () -> account.withdraw(200));
        assertThat(error.getMessage()).isEqualTo("balance is low");
    }
}
