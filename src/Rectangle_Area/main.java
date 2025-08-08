package Rectangle_Area;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the width: ");
        width=scanner.nextDouble();

        System.out.print("Enter the height: ");
        height=scanner.nextDouble();

        area = width*height;

        System.out.println("The area of the rectangle is "+area + "cmˆ2");

        scanner.close();
    }
}
