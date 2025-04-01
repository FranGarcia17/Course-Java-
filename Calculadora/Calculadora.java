package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingresa el primer numero: ");
            double num1 = scanner.nextDouble();

            System.out.println("Ingresa el segundo numero: ");
            double num2 = scanner.nextDouble();

            System.out.println("Suma:" + (num1 + num2));
            System.out.println("Resta:" + (num1 - num2));
            System.out.println("Multiplicacion: " + (num1 * num2));
            System.out.println("Division:" + (num1 / num2));
        }
    }
}
