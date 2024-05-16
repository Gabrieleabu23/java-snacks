package org.exercise.snacks;

import java.util.Scanner;

public class snack4palindroma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringa = scanner.nextLine();
        int counter = 0;

        for (int i =0;i< stringa.length() / 2;  i++) {
            if (stringa.charAt(i) == stringa.charAt(stringa.length() - 1 - i)) {
                counter++;
            }
        }
        System.out.println(counter  == stringa.length()/2 ? "La stringa è palindroma": "La stringa non è palindroma");
    }
}
