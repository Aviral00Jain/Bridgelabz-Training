

package com.junit.bankaccount;

import static org.junit.Assert.*;
import org.junit.Test;

public class BankAccountTest {
    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(1000);

        assertEquals(1000, account.getBalance(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawInsufficientBalance() {
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.withdraw(800);
    }
}