package org.exercise.snacks;

import java.util.Scanner;

public class snack1parioDispari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero (intero): ");
        int number = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println(number % 2 ==0 ? "il numero  è pari : "+ number : "il numero è dispari; il suo  successivo è : "+(number+1) );
    }
}
