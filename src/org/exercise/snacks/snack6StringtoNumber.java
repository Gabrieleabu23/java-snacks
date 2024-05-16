package org.exercise.snacks;

import java.util.Scanner;

public class snack6StringtoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.print("Numero in stringa: ");
        String numeroStringa = scanner.nextLine();
        scanner.close();
        for (int i = 0; i < numeroStringa.length(); i++) {

            int numberString = numeroStringa.charAt(i) - '0';
            if(numberString >= 0 && numberString <= 9){
                number = number * 10 + numberString;
            }
        }
        System.out.printf("Numero convertito in intero: %d",number);
    }
}
