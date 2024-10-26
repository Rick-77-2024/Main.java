package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Витрата пального автомобілем в літрах на 100 кілометрів");
        var fuel = scanner.nextDouble();

        while (true) {
            System.out.println("Відстань, що проїхало авто в кілометрах");
            var distance = scanner.nextDouble();

            if (distance == 0)
                break;

            var result = fuel * (distance / 100);
            System.out.println("Result = " + result);
        }
    }
}
