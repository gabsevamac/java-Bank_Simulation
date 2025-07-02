package Projeto_Simulando_Conta_Bancaria.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, insert the agency number: ");
        String agency = sc.next();
        System.out.print("Please, insert the account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Please, insert the client name: ");
        String client = sc.nextLine();
        System.out.print("Please, insert the account balance: ");
        Double balance = sc.nextDouble();

        BankAccount account = new BankAccount(number, agency, client, balance);

        System.out.println(account);
    }
}

class BankAccount{
    private int numAccount;
    private String agency;
    private String client;
    private Double balance;

    public BankAccount(int numAccount, String agency, String client, Double balance) {
        this.numAccount = numAccount;
        this.agency = agency;
        this.client = client;
        this.balance = balance;
    }

    public int getNumAccount() {
        return numAccount;
    }

    public String getAgency() {
        return agency;
    }

    public String getClient() {
        return client;
    }

    public Double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb
                .append("Olá ")
                .append(getClient())
                .append(",obrigado por criar uma conta em nosso banco, sua agência é ").append(getAgency())
                .append(", conta ").append(getNumAccount())
                .append(" e seu saldo ").append(getBalance())
                .append(" já está disponível para saque!").toString();
    }
}