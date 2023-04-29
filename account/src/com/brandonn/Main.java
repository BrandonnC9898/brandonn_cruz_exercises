package com.brandonn;

import com.brandonn.core.CurrentAccount;
import com.brandonn.core.SavingsAccount;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CurrentAccount currentAccount;
        SavingsAccount savingsAccount;

        // Create current account
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number of the current account: ");
        long numberAccount = scanner.nextLong();
        System.out.println("Write the balance of the current account: ");
        BigDecimal balance = BigDecimal.valueOf(scanner.nextDouble());
        currentAccount = new CurrentAccount(numberAccount, balance);
        System.out.println("Account number: " + currentAccount.getAccountNumber() + " " +
                " account balance: " + currentAccount.getBalance());

        // Deposit
        System.out.println("Write the amount to deposit: ");
        BigDecimal amountToDeposit = BigDecimal.valueOf(scanner.nextDouble());
        currentAccount.deposit(amountToDeposit);
        System.out.println("Balance: " + currentAccount.getBalance());

        // Refund
        System.out.println("Write the amount to refund: ");
        BigDecimal amountToRefund = BigDecimal.valueOf(scanner.nextDouble());
        currentAccount.refund(amountToRefund);
        System.out.println("Balance: " + currentAccount.getBalance());

        // Create savings account
        System.out.println("Write the interest (%) of the savings account: ");
        long interest = scanner.nextLong();
        savingsAccount = new SavingsAccount(numberAccount, currentAccount.getBalance(), interest);
        System.out.println("Account number: " + currentAccount.getAccountNumber() + " " +
                " account balance: " + currentAccount.getBalance() + " account interest: " +
                savingsAccount.getInterest());
        System.out.println("Profit: " + savingsAccount.calculateProfit());
    }
}
