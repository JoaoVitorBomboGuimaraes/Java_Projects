package if_training;

import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if(age >= 18)
        {
            System.out.println("You are an adult!");
        }
        else if(age < 0)
        {
            System.out.println("You haven't been born yet!");
        }
        else
        {
            System.out.println("You are an child!");
        }

        scanner.close();
    }
}
