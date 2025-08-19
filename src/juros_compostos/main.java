package juros_compostos;

import  java.util.Scanner;
public class main
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);

    double valor;
    System.out.println("Digite o valor a ser calculado: ");
    valor = sc.nextDouble();
    double juros;
    System.out.println("Digite o valor dos juros: ");
    juros = sc.nextDouble();
    juros = juros/100;
    double tempo;
    System.out.println("Digite o tempo dos juros: ");
    tempo = sc.nextDouble();
    double total;
    total = valor * Math.pow(1 + juros, tempo);
    System.out.println("O total calculado com os juros é: " + total);
}
}