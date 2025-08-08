package Trying_Variables;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int age; //int = numeros inteiros
        age = 19;
        int year = 2025;
        double price = 249.99; // double = numeros quebrados

        char grade = 'A'; // Char = caracter
        char symbol = '!';

        boolean isStudent = true; //obs: se a 'frase' tiver mais de uma palavra, a primeira e minuscula, depois maiuscula
        boolean forSale = false;

        System.out.println("The year is " + year); // o + -- é para imprimir determinada informaçao na variavel

        String name = "João"; // string = frases
        String car = "Mini";
        String color = "White";

        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        if (isStudent) {
            System.out.println("I am a student");
        } else {
            System.out.println("I am not a student");
        }
        System.out.println("My last grade was " + grade);
        System.out.println("My choice is a " + color + " " + year + " " + car);

        if (forSale) {
            System.out.println("There is a " + car + " for sale");
        } else {
            System.out.println("There is no " + car + " for sale");
        }
    }
}
