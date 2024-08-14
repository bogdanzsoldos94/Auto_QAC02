package homework.javaintro.firsthomework;

import java.util.Scanner;

public class ArthCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adauga primul numar: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Alege ce fel de operatiune vrei sa faci (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.print("Adauga al doilea numar: ");
        double secondNumber = scanner.nextDouble();

        double result = 0;

        if (operation == '+') {
            result = firstNumber + secondNumber;
        } else if (operation == '-') {
            result = firstNumber - secondNumber;
        } else if (operation == '*') {
            result = firstNumber * secondNumber;
        } else if (operation == '/') {
            if (secondNumber != 0) {
                result = firstNumber / secondNumber;
            } else {
                System.out.println("Error: Diviziunea cu zero nu este permisa");
                return;
            }
        } else {
            System.out.println("Error: Operatie invalida");
            return;
        }

        System.out.println("Rezultatul este: " + result);
    }
}
