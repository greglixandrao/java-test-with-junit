package com.greglixandrao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    public void checkExceptionScenario() {
        Account fromAccount = new Account("123456", 0);
        Account toAccount = new Account("852963", 50);

        TransferBetweenAccounts transferBetweenAccounts = new TransferBetweenAccounts();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            transferBetweenAccounts.transfer(fromAccount, toAccount, -80);
        });
    }
}
