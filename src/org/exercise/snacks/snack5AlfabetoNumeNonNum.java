package org.exercise.snacks;

import java.util.Scanner;

public class snack5AlfabetoNumeNonNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        int alphabetic = 0, num = 0, notAlphaNum = 0;
        do {
            System.out.print("Quanti caratteri  ha la tua stringa? Scoprilo (scrivi ok altrimenti digita 0) :");
            choice = scanner.nextLine();
            if (choice.charAt(0) != '0') {
                System.out.print("Inserisci la tua stringa!: ");
                String stringa = scanner.nextLine();
                for (int i = 0; i < stringa.length(); i++) {
                    char singleChar = stringa.charAt(i);
                    if (Character.isAlphabetic(singleChar)) {
                        alphabetic++;
                    } else if (Character.isDigit(singleChar)) {
                        num++;
                    } else {
                        notAlphaNum++;
                    }
                }
                System.out.println("Caratteri alphabetic:  " + alphabetic);
                System.out.println("Caratteri numerici:  " + num);
                System.out.println("Caratteri non Alfanumerici:  " + notAlphaNum);
            } else {
                alphabetic = 0;
                num = 0;
                notAlphaNum = 0;
            }
        } while (choice.charAt(0) != '0');
    }
}
