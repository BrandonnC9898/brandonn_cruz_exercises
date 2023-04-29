package com.brandonn.test;

import com.brandonn.core.CurrentAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CurrentAccountTests {
    private CurrentAccount account;

    @BeforeEach
    public void initialize() {
        account = new CurrentAccount(9000, BigDecimal.valueOf(100));
    }

    @Test
    @DisplayName("When deposit should add to balance")
    public void whenDepositShouldAddToBalance() {
        this.account.deposit(BigDecimal.valueOf(100));
        assertTrue(BigDecimal.valueOf(200).compareTo(account.getBalance()) == 0);
    }

    @Test
    @DisplayName("When refund should subtract to balance")
    public void whenRefundShouldSubtractToBalance() {
        this.account.refund(BigDecimal.valueOf(50));
        assertTrue(BigDecimal.valueOf(50).compareTo(account.getBalance()) == 0);
    }

    @Test
    @DisplayName("When concat account number and balance")
    public void whenConcatAccountNumberAndBalance() {
        assertEquals("9000 100", account.concatAccountNumberAndBalance());
    }
}
