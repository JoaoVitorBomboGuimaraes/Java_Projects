package JavaTriangulo;

import java.util.Scanner;

public class JavaTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura, base;
        float area;

        System.out.println("Digite o altura do triangulo: ");
        altura = teclado.nextInt();
        System.out.println("Digite o base do triangulo: ");
        base = teclado.nextInt();
        area = 0.5f * altura * base;
        System.out.println("Área do triangulo: " + area);
    }
}