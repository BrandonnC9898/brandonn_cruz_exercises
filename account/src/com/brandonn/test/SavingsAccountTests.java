package com.brandonn.test;

import com.brandonn.core.SavingsAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SavingsAccountTests {
    private SavingsAccount account;

    @BeforeEach
    public void initialize() {
        account = new SavingsAccount(9000, BigDecimal.valueOf(100), 10);
    }

    @Test
    @DisplayName("When calculate profit should return earnings")
    public void whenCalculateProfitShouldReturnEarnings() {
        assertTrue(BigDecimal.valueOf(10).compareTo(account.calculateProfit()) == 0);
    }

    @Test
    @DisplayName("When calculate profit for default interest should return earnings")
    public void whenCalculateProfitForDefaultInterestShouldReturnEarnings() {
        account = new SavingsAccount(9000, BigDecimal.valueOf(100));
        assertTrue(BigDecimal.valueOf(15.3).compareTo(account.calculateProfit()) == 0);
    }
}
