package org.exercise.snacks;

import java.util.Scanner;

public class snack7secondstoHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = Integer.parseInt(scanner.nextLine());

        int ore = seconds/3600;
//        debug
//        System.out.println(ore);
        int minuti = (seconds - (ore * 3600))/60;
//        debug
//        System.out.println(minuti);
        int secondi = seconds - (ore * 3600) - (minuti * 60);
        System.out.printf(ore > 9 ? "%d" : "0%d", ore);
        System.out.print("::");
        System.out.printf(minuti > 9 ? "%d" : "0%d", minuti);
        System.out.print("::");
        System.out.printf(secondi > 9 ? "%d" : "0%d", secondi);
    }
}
