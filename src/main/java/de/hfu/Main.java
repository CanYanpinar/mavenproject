package de.hfu;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        String s = this.readInput(System.in);
        System.out.println(s.toUpperCase());
    }

    /**
     * Reads the input string from a inputStream
     * @param inputStream for example System.in
     * @return typed string of the inputstream
     */
    public String readInput(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream);
        String s = scanner.nextLine();
        scanner.close();
        return s;
    }

}
