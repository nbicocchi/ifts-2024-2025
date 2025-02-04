package com.nbicocchi.exercises.inheritance;

public class LocalBankAccount extends BankAccount {
    public LocalBankAccount(String IBAN, String owner, double balance, double interestRate) {
        super(IBAN, owner, balance, interestRate);
    }

    public LocalBankAccount(String IBAN, String owner) {
        super(IBAN, owner);
    }

    public double wire(double amount, BankAccount otherAccount) {
        if (!IBAN.substring(0, 3).equals(otherAccount.getIBAN().substring(0, 2))) {
            throw new IllegalArgumentException("IBAN is not country local");
        }
        withdraw(amount);
        otherAccount.deposit(amount);
        return balance;
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("IT123", "ABC");
        BankAccount a2 = new LocalBankAccount("US123", "BCE");
        a1.wire(1000, a2);
        System.out.println(a1);
        System.out.println(a2);
        a2.wire(1000, a1);
    }
}
