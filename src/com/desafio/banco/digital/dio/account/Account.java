package com.desafio.banco.digital.dio.account;

import com.desafio.banco.digital.dio.client.Client;

public class Account {
    private final Client client; //Cliente
    private final int agencyNumber;//Número da Agência
    private static int accountNumber = 1; //Número da Conta
    private final AccountType accountType; //Tipo de Conta
    private double balance; //Saldo

    public Account(Client client, int agencyNumber, AccountType accountType, double balance) {
        this.client = client;
        this.agencyNumber = agencyNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void withdraw(double value) { //Sacar
        if (this.balance >= value) {
            this.balance -= value;
        }
    }

    public void deposit(double value) { //Depositar
        this.balance += value;
    }

    public void transfer(Account destiny, double value) { //Transferir
        this.withdraw(value);
        destiny.deposit(value);
    }

    public int countAccountNumber() {
        return accountNumber++;
    }

    public void printExtract() {
        System.out.println("========== EXTRATO BANCÁRIO ==========");
        System.out.println("Nome do Cliente: " + this.client.name());
        System.out.println("Tipo de Conta: " + this.client.type_client().getDescriptor());
        System.out.println("Agência: " + this.agencyNumber);
        System.out.println("Número da Conta: " + countAccountNumber());
        System.out.println("Tipo de Operação: " + this.accountType.getDescriptor());
        System.out.println("Saldo: " + this.balance);
    }
}
