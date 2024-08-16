package edu.mateus.dio.desafios;

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeCliente;
        int agencia;
        int numeroConta;
        double saldo;

        System.out.println("Bem vindo(a)! Digite seu nome: ");
        nomeCliente = scan.nextLine();

        System.out.println("Digite o número de sua agência: ");
        agencia = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite o número de sua conta: ");
        numeroConta = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite o saldo: ");
        saldo = scan.nextDouble();
        scan.nextLine();

        System.out.println("Olá " + nomeCliente + " , obrigado por abrir uma conta em nosso banco!");
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numeroConta );
        System.out.println("Saldo: " + saldo);

        scan.close();
    }
}
