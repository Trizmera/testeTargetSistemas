package org.example;

import java.util.Scanner;

public class questaoCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        scanner.close();

        StringBuilder reverso = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reverso.append(input.charAt(i));
        }

        System.out.println("String invertida: " + reverso.toString());
    }
}
