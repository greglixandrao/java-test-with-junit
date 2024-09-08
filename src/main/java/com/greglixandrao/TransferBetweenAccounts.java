package com.greglixandrao;

public class TransferBetweenAccounts {
    public void transfer(Account fromAccount, Account toAccount, int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }

        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }
}
