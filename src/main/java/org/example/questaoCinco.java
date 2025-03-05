package org.example;

import java.util.Scanner;

public class questaoCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        scanner.close();

        String reverso = new StringBuilder(input).reverse().toString();
        System.out.println("String invertida: " + reverso);
    }
}
