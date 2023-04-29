package com.brandonn.core;

import java.math.BigDecimal;

public class SavingsAccount extends CurrentAccount {
    private double interest;

    public SavingsAccount(long accountNumber, BigDecimal balance) {
        super(accountNumber, balance);
        this.interest = 15.3;
    }

    public SavingsAccount(long accountNumber, BigDecimal balance, double interest) {
        super(accountNumber, balance);
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public BigDecimal calculateProfit() {
        return this.getBalance().multiply(BigDecimal.valueOf(this.interest / 100));
    }
}
