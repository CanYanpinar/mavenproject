package de.hfu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.printf(s.toUpperCase());
        scanner.close();
    }

}
