package math;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {

       //  double result;
/*

        result = Math.pow(2, 3); // pow = potencia;
        result = Math.abs(-5); // módulo
        result = Math.sqrt(9); // raiz quadrada
        result = Math.round(3.14); // aproxima para o inteiro mais próximo;
        result = Math.ceil(3.14); // aredonda sempre para cima;
        result = Math.floor(3.14); // arredonda sempre para baixo;
        result = Math.max(10, 20); // acha o maior valor;
        result = Math.min(5, 10); // acha o menor valor

*/
        Scanner scanner = new Scanner(System.in);
        double cat1, cat2, hip;
        System.out.println("Digite o primeiro cateto: ");
        cat1 = scanner.nextDouble();
        System.out.println("Digite o segundo cateto: ");
        cat2 = scanner.nextDouble();
        hip = Math.sqrt(Math.pow(cat1, 2)+Math.pow(cat2, 2));
        System.out.println("O valor da hipotenusa é: " + hip);

        double raio, circun, area, volume;
        System.out.println("Digite o valor da raio da circunferencia: ");
        raio = scanner.nextDouble();
        circun = 2 * Math.PI * raio;
        area = Math.PI * Math.pow(raio, 2);
        volume = Math.PI * (4.0/3.0) * Math.pow(raio, 3);
        System.out.println("O valor da circunferencia é: " + circun);
        System.out.println("O valor da area é: " + area);
        System.out.println("O valor do volume é: " + volume);
    }
}
