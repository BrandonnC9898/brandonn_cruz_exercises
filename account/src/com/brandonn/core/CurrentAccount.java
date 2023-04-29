package com.brandonn.core;

import java.math.BigDecimal;

public class CurrentAccount {
    private String name;
    private String lastName;
    private int age;
    private long accountNumber;
    private BigDecimal balance;

    public CurrentAccount(long accountNumber, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public CurrentAccount(String name, String lastName, int age, long accountNumber, BigDecimal balance) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    public void refund(BigDecimal amount) {
        this.balance = this.balance.subtract(amount);
    }

    public String concatAccountNumberAndBalance() {
        return Long.toString(this.accountNumber) + " " + this.balance.toString();
    }
}
