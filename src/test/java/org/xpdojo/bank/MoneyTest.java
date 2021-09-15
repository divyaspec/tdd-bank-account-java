package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoneyTest {

    @Test
    public void canCreateMoney() {
        Money money = new Money(10);
        assertThat(money.getAmount()).isEqualTo(10);
    }
}