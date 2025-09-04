package Lab3;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando conta
        System.out.println("=== Criar Conta ===");
        System.out.print("Número da conta: ");
        int num = sc.nextInt();
        sc.nextLine(); // limpar buffer

        System.out.print("Nome do correntista: ");
        String nome = sc.nextLine();

        System.out.print("Limite da conta: ");
        double limite = sc.nextDouble();

        Account conta = new Account(num, nome, limite);

        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Alterar senha");
            System.out.println("5 - Dados da conta");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Saldo atual: R$ " + conta.getSaldo());

                case 2 -> {
                    System.out.print("Valor do depósito: ");
                    double dep = sc.nextDouble();
                    if (conta.deposit(dep)) {
                        System.out.println("Depósito realizado!");
                    } else {
                        System.out.println("Valor inválido.");
                    }
                }

                case 3 -> {
                    System.out.print("Valor do saque: ");
                    double saq = sc.nextDouble();
                    if (conta.withdraw(saq)) {
                        System.out.println("Saque realizado!");
                    } else {
                        System.out.println("Saldo e limite insuficientes.");
                    }
                }

                case 4 -> {
                    sc.nextLine(); // limpar buffer
                    System.out.print("Digite a senha atual: ");
                    String oldPass = sc.nextLine();
                    System.out.print("Digite a nova senha: ");
                    String newPass = sc.nextLine();

                    if (conta.changePassword(oldPass, newPass)) {
                        System.out.println("Senha alterada com sucesso!");
                    } else {
                        System.out.println("Senha antiga incorreta!");
                    }
                }

                case 5 -> conta.imprimir();

                case 0 -> System.out.println("Encerrando...");

                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}